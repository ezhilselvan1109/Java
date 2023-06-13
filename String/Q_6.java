//Write a Java program to divide a string in n equal parts.

import java.util.*;

class Q_1{
    static void splitString(String str, int n) {
        int str_size = str.length();
        int part_size;
        if (str_size % n != 0) {
            System.out.println("The size of the given string is not divisible by " + n);
            return;
        } else {
            System.out.println("The given string is: " + str);
            System.out.println("The string divided into " + n + " parts and they are: ");
            part_size = str_size / n;
            for (int i = 0; i < str_size; i++) {
                if (i % part_size == 0) System.out.println();
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter The String: ");
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println("Enter The Number: ");
        int split_number = scan.nextInt();
        splitString(str,split_number);
    }
}