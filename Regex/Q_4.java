/*
Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
*/
import java.util.Scanner;
public class Q_4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str=scan.next();
        System.out.println(validate(str));
    }
    public static boolean validate(String text) {
        return text.matches("p.*?q$");
    }
}
