//    Write a program for calculating Matrix Operations.
//
//        Addition.
//
//        Multiplication.

import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1 - Addition.");
        System.out.println("2 - Multiplication.");
        System.out.print("Enter The Choice: ");
        int Choice=scan.nextInt();
        switch (Choice){
            case 1:
                addition();
                break;
            case 2:
                multiplication();
                break;
        }
        scan.close();
    }
    static void addition(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Row size: ");
        int row=scan.nextInt();
        System.out.print("Enter the col size: ");
        int col=scan.nextInt();
        int arr1[][]=new int[row][col];
        int arr2[][]=new int[row][col];
        System.out.print("Enter the 1st Array Element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        System.out.print("Enter the 2st Array Element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=scan.nextInt();
            }
        }
        System.out.println("Ans:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
    static void multiplication(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Row size: ");
        int row=scan.nextInt();
        System.out.print("Enter the col size: ");
        int col=scan.nextInt();
        int arr1[][]=new int[row][col];
        int arr2[][]=new int[row][col];
        System.out.print("Enter the 1st Array Element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        System.out.print("Enter the 2st Array Element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=scan.nextInt();
            }
        }
        System.out.println("Ans:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr1[i][j]*arr2[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
