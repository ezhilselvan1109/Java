/*
Write a program to illustrate an example for using ‘super’ keyword to refer an immediate parent class member like

        a. in invoking a constructor

        b. using as a current object to access instance variables and methods.

 */
class Animal{
    public Animal(){
        System.out.println(color);
    }
    String color="white";
}
class Dog extends Animal{
    Dog(){
        super();
    }
    String color="black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }}
