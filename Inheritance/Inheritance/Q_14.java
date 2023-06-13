// Write a program to create automatic type conversions apply to overriding.
class Parent{
    public void print(){
        System.out.println("Parent Class Method");
    }
}

class Child{
    public void print(){
        System.out.println("Child Class Method");
    }
}

class Main
{
    public static void main (String args[]){
        Parent obj1 = new Parent();
        obj1.print();
        Child obj2 = new Child();
        obj2.print();
    }
}