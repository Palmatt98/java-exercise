package polymorphism;

import java.util.ArrayList;
import java.util.List;

class Primate extends Cane {
    public boolean hasHair() {
        return true;
    }

}

class Cane {

}

interface HasTail {
    boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Cane veroCane = new Primate();

        Primate antoherPrimate = (Primate) veroCane;

        //Lemur anotherLemur2 = (Lemur) primateVero;
    }
}