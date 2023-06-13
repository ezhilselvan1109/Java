//Create a class called Shape with subclass Rectangle and Triange and calculate area using a
// method "findArea" for the subclasses using polymorphism.

class Shapes {
    public void findArea() {
        System.out.println("Shapes  Class Method");
    }
}
class Triangle extends Shapes {
    public void findArea() {
        System.out.println("Triangle Class Method");
    }
}
class Rectangle extends Shapes {
    public void findArea() {
        System.out.println("Rectangle Class Method");
    }
}
class Main {
    public static void main(String[] args) {
        Shapes myShape = new Shapes();
        Shapes myTriangle = new Triangle();
        Shapes myRectangle = new Rectangle();
        myShape.findArea();
        myTriangle.findArea();
        myShape.findArea();
        myRectangle.findArea();
    }
}