/*
Write a Java program to sort an array of positive integers of a given array, in the sorted array the value of the first element 
should be maximum, second value should be the minimum value, third should be the second maximum, fourth second be the second minimum 
and so on.
*/

import java.util.*;

class Q_11{
    public static void main(String[] args) {        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter The Array Element: ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        insertionSort(arr);
        printArray(arr);
        scan.close();
    }


    static void printArray(int arr[]){
        int i,j;
        for(i=0,j=(arr.length)-1;i<j;j--,i++){
            System.out.print(arr[j]+" "+arr[i]+" ");
        }
        if(arr.length%2==1){
            System.out.print(arr[i]+" ");
        }

    }
    static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}