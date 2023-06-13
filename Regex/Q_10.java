/*
Write a Java program to count the number of decimal places in a given number.
*/

import java.util.Scanner;

public class Q_10 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }

    public static Integer validate(String n) {
        if(n.contains("."))
			return n.replaceAll(".*\\.(?=\\d)", "").length();
		return 0;
    }
}


