//Write a Java program to add two matrices of the same size.

import java.util.*;

class Q_8{
    public static void main(String[] args) {
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
    }
}