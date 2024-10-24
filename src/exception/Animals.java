package exception;

public class Animals {
    public static void main(String[] args) {
        try {
            throw new ExhibitClosedForLunch();
        } catch (ExhibitClosedForLunch e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("AnimalsOutForAWalk");
        } catch (RuntimeException e) {// second catch block
            System.out.print("RuntimeException");
        } catch (Exception e) {// second catch block
            System.out.print("Exception");
        } catch (Throwable e) {// second catch block
            System.out.print("Throwable");
        }
    }
}

class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }
