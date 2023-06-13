/*
Write a Java program to read two strings append them together and return the result.
If the strings are different lengths, remove characters from the beginning of the longer
string and make them equal length.
*/

import  java.util.Scanner;

class Q_4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The First String: ");
        String str1=scan.next();
        System.out.println("Enter The Second String: ");
        String str2=scan.next();
        System.out.println("Ans: "+function(str1,str2));
    }
    public static String function(String st1, String st2)
    {
        if (st1.length() == st2.length())
            return st1+st2;
        if (st1.length() > st2.length())
        {
            int diff = st1.length() - st2.length();
            return st1.substring(diff, st1.length()) + st2;
        } else
        {
            int diff = st2.length() - st1.length();
            return st1 + st2.substring(diff, st2.length());
        }
    }
}
