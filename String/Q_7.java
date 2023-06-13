/*
Write a Java program to check if two given strings are rotations of each other.

Sample Output:

The given strings are: ABACD  and  CDABA

The concatenation of 1st string twice is: ABACDABACD

The 2nd string CDABA  exists in the new string.

Strings are rotations of each other

*/

import java.util.*;
class Q_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();        
        String str3 = str1 + str2;        
        int length = str3.length() - str2.length();
        System.out.println(str3);        
        for (int i = 0; i <= length; i++) {
            String sub = str3.substring(i, i + str2.length());
            if (sub.equals(str2) == true) {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}