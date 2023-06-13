/*
Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

Sample array: [1,2,4,5,6]

Target value: 6.

*/

import java.util.*;

class Q_9{
    public static void main(String[] args) {        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter The Array Element: ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter The Target Value: ");
        int Target=scan.nextInt();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==Target){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+Target);
                }
            }
        }
        scan.close();
    }
}
    