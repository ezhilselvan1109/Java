/*
Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.

        Input :

        nums = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 }

        Output:

        The largest sub-array is [1, 7]

        Elements of the sub-array: 5 0 2 1 4 3 6
*/

import java.util.*;


public class Subarray {

    public static int CurrentMax = Integer.MIN_VALUE;
    public static int CurrentMin = Integer.MAX_VALUE;

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter The Array Element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        MaxConsecutiveSubArray(arr);

    }

    public static void MaxConsecutiveSubArray(int arr[]) {
        int MaxSubarrayCount = Integer.MIN_VALUE;
        int startind = 0;
        int endind = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                Boolean res = IsConsecutive(i, j, arr);
                if (res) {
                    int cal = j - i;
                    if (MaxSubarrayCount < cal) {
                        MaxSubarrayCount = cal;
                        startind = i + 1;
                        endind = j;
                    }
                }
            }
        }
        System.out.println("Max is : " + MaxSubarrayCount);
        System.out.println("Start Ind : " + startind);
        System.out.println("End Ind : " + endind);
        for (int i = startind; i <= endind; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean IsConsecutive(int start, int End, int arr[]) {
        GetMinandMax(start, End, arr);
        int difference = CurrentMax - CurrentMin;
        int arrsize = End - start;
        if (difference == arrsize - 1) {
            for (int i = CurrentMin; i <= CurrentMax; i++) {
                Boolean res = IsFound(start, End, i, arr);
                if (!res) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public static void GetMinandMax(int start, int End, int arr[]) {
        CurrentMax = Integer.MIN_VALUE;
        CurrentMin = Integer.MAX_VALUE;
        for (int i = start; i <= End; i++) {
            if (arr[i] < CurrentMin) {
                CurrentMin = arr[i];
            }
            if (arr[i] > CurrentMax) {
                CurrentMax = arr[i];
            }
        }
    }

    public static boolean IsFound(int start, int End, int Element, int arr[]) {
        for (int i = start; i <= End; i++) {
            if (arr[i] == Element) {
                return true;
            }
        }
        return false;
    }

}