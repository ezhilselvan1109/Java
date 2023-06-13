/*
Write a Java program to match a string that contains only upper and lowercase letters, numbers,
and underscores.
*/
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q_6 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }
    public static boolean validate(String text) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
        Matcher m = pattern.matcher(text);
        return m.find();
           
    }
}