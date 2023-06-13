public class Main{
    public static void main(String[] args) {
        Child java = new Child();
        java.childPrint();
        java.parentPrint();
    }
}

interface Backend {
    public void childPrint();
}
class Parent {
    public void parentPrint() {
        System.out.println("parentPrint Method");
    }
}
class Child extends Parent implements Backend {
    public void childPrint() {
        System.out.println("childPrint Method");
    }
}
