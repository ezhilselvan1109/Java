/*
Write a Java program to check whether a string contains only a certain set of characters
(in this case a-z, A-Z and 0-9).
*/

import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }
    public static boolean validate(String text) {
        return text.matches("^[\\w]+$");
    }
}

