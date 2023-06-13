/*
Write a Java program to remove all the vowels of a given string. Return the new string.
*/

import java.util.*;
public class Q_9 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }

    public static String validate(String ip) {
        return ip.replaceAll("[aeiouAEIOU]", "");
    }
}