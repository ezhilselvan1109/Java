/*
Write a Java program to remove leading zeros from a given IP address.
*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q_7 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }

    public static String validate(String ip) {
	  Pattern pattern = Pattern.compile("[0]");
        Matcher m = pattern.matcher(ip);
        return m.replaceAll("");
    }
}