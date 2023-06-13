//Write a program for dynamic binding and static binding in Java

class Parant{
    public void print(){
        System.out.println("Parant Class");
    }
}

class Child extends Parant{
    public void print(){
        System.out.println("Child Class");
    }
}
class Q_1{
    public static void main(String[] args) {
        Child Childobj=new Child();
        Parant Parantobj=new Child();

        //Childobj.print();
        Parantobj.print();
    }
}