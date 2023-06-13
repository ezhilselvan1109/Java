/*
Write a Java program to create a new string from a given string by swapping the last two characters of the given string.
The length of the given string must be two or more.
*/

import java.util.*;

class Q_9{
    public static void main(String[] args) {        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str=scan.next();
        System.out.println("Ans: "+lastTwoCharacters(str));
        scan.close();
    }

    public static String lastTwoCharacters(String str)
    {
        if (str.length() < 2){
            return str;
        }
        return str.substring(0, str.length()-2)+ str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }
}
    