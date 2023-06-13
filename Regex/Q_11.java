/*
Write a Java program to validate a personal identification number (PIN).
Assume the length of a PIN number is 4, 6 or 8.
*/
import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }
    public static boolean validate(String n) {
        return n.matches("\\d{4}|\\d{6}|\\d{8}");
    }
}