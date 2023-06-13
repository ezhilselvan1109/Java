//Write a Java program to find first non repeating character in a string.


import java.util.*;
class Q_5{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str1 =scan.next();
        System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }
    }
}

