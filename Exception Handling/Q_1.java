/*
Write a program to illustrate how to throw an exception.
*/
import java.util.Scanner;

public class Q_1 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=scan.nextInt();
        checkAge(num);
    }
}
