/*
Create an outer class named outer with a function called display, again create another class inside the outer class
named inner with a function called display and call the two functions in the main class.
*/
public class Main{
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.display();
        Outer.Inner inner=outer.new Inner();
        inner.display();
    }
}

class Outer{
    public void display(){
        System.out.println("Outer Class Method");
    }
    class Inner{
        public void display(){
            System.out.println("Inner Class Method");
        }
    }
}




