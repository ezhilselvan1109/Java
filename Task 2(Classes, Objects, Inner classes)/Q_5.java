//Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
// respectively by creating two objects of class 'Student'.

import java.util.Scanner;

class Student{
    int roll_number, phone_number;
    String address,name;
    void SamAssign(){
        name="Sam";
        roll_number=10001;
        phone_number=1234567890;
        address="zoho,Guduvancheri";
    }
    void JohnAssign(){
        name="John";
        roll_number=10002;
        phone_number=1234512345;
        address="zoho,Guduvancheri";
    }
    void print(){
        System.out.println(name+"\t"+roll_number+"\t"+phone_number+"\t"+address);
    }
    public static void main(String[] args) {
        Student Sam=new Student();
        Student  John=new Student();
        Sam.SamAssign();
        John.JohnAssign();
        System.out.println("Name roll_number phone_number address");
        Sam.print();
        John.print();
    }
}