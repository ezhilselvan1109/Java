//Write a program to find the number and the square of a number both present in the array of numbers.

import java.util.*;

class Q_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter The Array Element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<size;i++){
            int sqare=arr[i]*arr[i];
            for(int j=0;j<size;j++){
                if(arr[j]==sqare){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }
}

//{ 2, 4, 5, 20, 16 }