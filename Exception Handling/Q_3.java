/*
Write a program to illustrate how to use multiple catch statements.
*/

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("Enter The Array Size: ");
            int size=scan.nextInt();
            int arr[]=new int[size];
            System.out.print("Enter The Array Element : ");
            for(int i=0;i<size;i++){
                arr[i]=scan.nextInt();
            }
            System.out.print("Enter The Array Index: ");
            int index=scan.nextInt();
            arr[index]=arr[index];
            System.out.print("Enter The number for divide: ");
            int divideNumber=scan.nextInt();
            arr[index]=arr[index]/divideNumber;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(NegativeArraySizeException n)
        {
            System.out.println("NegativeArraySizeException Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}