/*
Write a Java program to form the largest number from a given list of non-negative integers.

        Example:

        Input :

        nums = {1, 2, 3, 0, 4, 6}

        Output:

        Largest number using the said array numbers: 643210
*/
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
        int Max=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int currentmax=Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>currentmax && arr[j]<Max){
                    currentmax=arr[j];
                }
            }
            sum=sum*10+currentmax;
            Max=currentmax;
        }
        System.out.println("\nsum: "+sum);
    }

    //FindMax(arr,Integer.MAX_VALUE);
    public static void FindMax(int arr[],int Max){
        int currentmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>currentmax && arr[i]<Max){
                currentmax=arr[i];
            }
        }
        if(currentmax==Integer.MIN_VALUE){
            return;
        }
        System.out.print(currentmax+" ");
        FindMax(arr,currentmax);
    }
}
