/*
Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address

Robert            1994                64C- WallsStreat

Sam                2000                68D- WallsStreat

John                1999                26B- WallsStreat
*/
import java.util.Scanner;

class Employee{
    String name,address;
    int year_of_joining,salary;
    public  Employee(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Name: ");
        name=scan.next();
        System.out.print("Enter The year_of_joining: ");
        year_of_joining=scan.nextInt();
        System.out.print("Enter The salary: ");
        salary=scan.nextInt();
        System.out.print("Enter The address: ");
        address=scan.next();
    }
    public void print(){
        System.out.print(name+"\t\t");
        System.out.print(year_of_joining+"\t\t");;
        System.out.print(salary+"\t");
        System.out.println(address);
    }
    public static void main(String[] args) {
        Employee[] obj=new Employee[3];
        for(int i=0;i<1;i++){
            obj[i]=new Employee();
        }
        System.out.println("Name \t year_of_joining \t salary \t address");
        for(int i=0;i<1;i++){
            obj[i].print();
        }
    }
}
