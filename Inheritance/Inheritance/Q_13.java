/*
Create an outer class with a function display, again create another class inside the outer
class named inner with a function called display and call the two functions in the main class.
*/

class Outer{
    void display()
    {
        System.out.println("This is Outer Class");
    }
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("This is inner Class");
        }
    }
}
class Main{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.display();
        outer.test();
    }

}

