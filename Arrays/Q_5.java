//Write a program to arrange the numbers in ascending order using Insertion sort.

import java.util.*;

class Q_5{
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

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}