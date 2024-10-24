package esercizi.completi.xml.parser;

import java.util.*;

public class Tag {

    public Map<String, String> attributes = new HashMap<>();

    public List<Tag> children = new ArrayList<>();

    public String tagName;

    //public Tag father;
}
