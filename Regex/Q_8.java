
/*
Write a Java program to find the word Python in a given string, if the word Python present in the string
return Java otherwise return C++. Ignore case-sensitive.
*/



import java.util.*;

public class Q_8 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }
    public static String validate(String text) {
        String str = text.toLowerCase();
        if (str.matches("python")) {
            return "Java";
        }
        return "C++";
    }
}