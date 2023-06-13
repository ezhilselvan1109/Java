//Write a program to give a simple example for an abstract class.

abstract class Parent{
    abstract void print();
}

class Child extends Parent{
    void print(){
        System.out.println("Calling Method");
    }
}  

class Main{
    public static void main(String args[]){
        Child obj = new Child();
        obj.print();
    }
}