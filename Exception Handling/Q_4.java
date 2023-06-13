/*
Write a program to illustrate sub class exception precedence over base class.
*/

import java.util.Scanner;

class Parent{
    void print() {
        System.out.println("sup class method");
    }
}

class Child extends Parent{
    void print()throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        System.out.print("sub class method");
        System.out.print("Enter The Numerator Value: ");
        int numerator=sc.nextInt();
        System.out.print("Enter The Denominator Value: ");
        int denominator=sc.nextInt();
        System.out.println(numerator/denominator);
    }

}
class Q_4{
    public static void main(String args[]) {
        Parent p = new Child();
        try {
            p.print();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}