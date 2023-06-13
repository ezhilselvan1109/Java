//Write a program to remove all zero's from the array of numbers.

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Array Size: ");
        int Size=scan.nextInt();
        int arr[]=new int[Size];
        System.out.print("Enter The Array Element: ");
        for (int i=0;i<Size;i++){
            arr[i]=scan.nextInt();
        }
        int index=0;
        for (int i=0;i<Size;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
