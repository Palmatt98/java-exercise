package constructor;

public class Hamster {
    private String color;
    private int weight;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }


    public Hamster(int weight) {
        this(weight, "brown");
//        this.weight = weight;
//        this.color = "brown";
    }

    public Hamster(String color) {
        this(10, color);
//        this.weight = 10;
//        this.color = color;
    }

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        Hamster hamster = new Hamster(20);
        System.out.println(hamster.getWeight() + " " + hamster.getColor());
        Hamster hamster1 = new Hamster("blue");
        System.out.println(hamster1.weight + " " + hamster1.color);
        Hamster hamster2 = new Hamster(40, "white");
        System.out.println(hamster2.weight + " " + hamster2.color);
    }
}
