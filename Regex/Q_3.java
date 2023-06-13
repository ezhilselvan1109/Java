/*
Write a Java program to find sequences of lowercase letters joined with a underscore.
*/

import java.util.Scanner;
public class Q_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }
    public static boolean validate(String text) {
        return text.matches("^[a-z]+_[a-z]+$");
    }
}

