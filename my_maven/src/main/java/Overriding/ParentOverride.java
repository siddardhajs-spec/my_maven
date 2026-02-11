package Overriding;

public class ParentOverride {

    public void display() {
        System.out.println("method in parent");
    }

    static class ChildOverride extends ParentOverride {
        public void display() {
            System.out.println("method in child");
        }
    }

    public static void main(String[] args) {

        ChildOverride obj = new ChildOverride();
        obj.display();
    }
}