/*
Write a program using try and catch block where check whether the given array size is negative or not.
*/

import java.util.Scanner;

public class Q_2 {
    public static void main(String a[]){
        Scanner scan=new Scanner(System.in);
        try {
            System.out.print("Enter The Array Size: ");
            int size=scan.nextInt();
            int a1[] = new int[size];
            System.out.println("first element : "+a1[0]);
        }
        catch(NegativeArraySizeException n) {
            System.out.println("generated exception :  "+ n);
        }
        System.out.println("After the try block " );
    }
}