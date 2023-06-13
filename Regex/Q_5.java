/*
Write a Java program that matches a word containing 'g', not at the start or end of the word.
*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q_5 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }

    public static boolean validate(String text) {
        Pattern pattern = Pattern.compile("\\Bg\\B");
        Matcher m = pattern.matcher(text);
        return m.find();
    }
}
