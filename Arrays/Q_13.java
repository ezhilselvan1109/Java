/*
Write a Java program to check if a given array contains a subarray with 0 sum

Input :

nums1= { 1, 2, -2, 3, 4, 5, 6 }

nums2 = { 1, 2, 3, 4, 5, 6 }

nums3 = { 1, 2, -3, 4, 5, 6 }

Output:

Does the said array contain a subarray with 0 sum: true

Does the said array contain a subarray with 0 sum: false

Does the said array contain a subarray with 0 sum: true

*/


import java.util.*;

class Q_13{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int Size=scan.nextInt();
        int arr[]=new int[Size];
        System.out.println("Enter The Array Element: ");
        for(int i=0;i<Size;i++){
            arr[i]=scan.nextInt();
        }
        int i,j,sum;
        boolean flag=false;
        for(i=0;i<Size;i++){
            sum=arr[i];
            for(j=i+1;j<Size;j++){
                sum+=arr[j];
                if(sum==0){
                    System.out.println("True");
                    flag=true;
                }
            }
        }
        if(!flag){
            System.out.println("False");
        }
        scan.close();
    }
}
//{ 1, 2, 3, 4, 5, 6 }
// { 1, 2, -3, 4, 5, 6 }