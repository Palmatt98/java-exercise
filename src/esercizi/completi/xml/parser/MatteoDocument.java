package esercizi.completi.xml.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatteoDocument {

    public Map<String, String> prologAttributes = new HashMap<>();

    public Tag root;

    public static MatteoDocument parse(String file) {
        MatteoDocument document = new MatteoDocument();
        document.prologAttributes = getAttributes(file, "<?", "?>");
        //Diventa quello che ritorna "buildRoot" qiundi di tipo 'Tag' che troviamo a riga 26
        document.root = buildRoot(file);

        return document;
    }

    private static Tag buildRoot(String file) {
        int endProlog = file.indexOf("?>");
        int startRoot = file.indexOf("<", endProlog);
        int end = file.lastIndexOf(">");
        String rootString = file.substring(startRoot, end + 1);
        //diventa quello che ritorna  "parseTagName" ossia  di tipo                  String
        String tagName = parseTagName(rootString.substring(0, rootString.indexOf(">") + 1));

        Map<String, String> attributes = getAttributes(rootString.substring(0, rootString.indexOf(">") + 1), "<", ">");

        List<Tag> children = getChildren(rootString, tagName);

        Tag root = new Tag();
        root.tagName = tagName;
        root.attributes = attributes;
        root.children = children;

        return root;
    }

    private static List<Tag> getChildren(String rootString, String tagName) {
        List<Tag> children = new ArrayList<>();

        int start = rootString.indexOf("<", 1);
        int end = rootString.indexOf("</" + tagName) - 1;

        if (end < start) {
            return children;
        }

        String childrenString = rootString.substring(start, end);
        childrenString = childrenString.substring(0, childrenString.lastIndexOf(">") + 1);


        while (start != -1) {

            int endTagStringChild = childrenString.indexOf(">") + 1;
            String tagRowChild = childrenString.substring(0, endTagStringChild);
            String tagNameChild = parseTagName(tagRowChild);

            int closeTagChildIndex = childrenString.indexOf("</" + tagNameChild);
            int endChildIndex = childrenString.indexOf(">", closeTagChildIndex) + 1;

            String childString = childrenString.substring(0, endChildIndex);

            Tag child = new Tag();
            child.tagName = tagNameChild;
            child.attributes = getAttributes(tagRowChild, "<", ">");
            child.children = getChildren(childString, tagNameChild);

            children.add(child);

            int startNewTagIndex = childrenString.indexOf("<", endChildIndex);

            if (startNewTagIndex != -1) {
                childrenString = childrenString.substring(startNewTagIndex);
                start = childrenString.indexOf("<");
            } else {
                start = -1;
            }
        }

        return children;
    }

    private static String parseTagName(String tagRow) {
        int endIndexTagName = -1;
        if (tagRow.indexOf(" ") != -1) {
            endIndexTagName = tagRow.indexOf(" ");
        } else {
            endIndexTagName = tagRow.indexOf(">");
        }

        String tagName = null;
        if (endIndexTagName != -1) {
            tagName = tagRow.substring(1, endIndexTagName);
        }
        return tagName;
    }

    public static Map<String, String> getAttributes(String file, String startString, String endString) {
        Map<String, String> attributes = new HashMap<>();
        //dalla stringa completa del file, estrapola una sotto stringa del prologo
        int start = file.indexOf(startString);
        int end = file.indexOf(endString);
        String prologString = file.substring(start, end + endString.length());

        int equal = prologString.indexOf("=");

        while (equal != -1) {
            int startIndexAttrName = -1;
            for (int i = equal - 1; i >= 0; i--) {
                if (prologString.charAt(i) == ' ') {
                    startIndexAttrName = i + 1;
                    break;
                }
            }

            String attributeName = prologString.substring(startIndexAttrName, equal);

            int endIndexAttrValue = -1;
            for (int i = equal + 2; i < prologString.length(); i++) {
                if (prologString.charAt(i) == '"') {
                    endIndexAttrValue = i;
                    break;
                }
            }

            String attributeValue = prologString.substring(equal + 2, endIndexAttrValue);

            attributes.put(attributeName, attributeValue);

            equal = prologString.indexOf("=", equal + 1);
        }

        return attributes;
    }

    public static void main(String[] args) {
        String filePath = "C:/Users/Matteo/test_parser1.xml";
        String xmlContent;

        try {
            xmlContent = Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Si nu trmon");
        }

        MatteoDocument newDocument = parse(xmlContent);
    }

}
