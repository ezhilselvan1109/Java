//    Given two sorted arrays A and B of size p and q, write a Java program to merge elements of
//    A with B by maintaining the sorted order i.e.
//    fill A with first p smallest elements and fill B with remaining elements.
//
//Input :
//
//int[] A = { 1, 5, 6, 7, 8, 10 }
//
//int[] B = { 2, 4, 9 }
//
//Output:
//
//Sorted Arrays:
//
//A: [1, 2, 4, 5, 6, 7]
//
//B: [8, 9, 10]

import java.util.*;

class Q_2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The A Array:");
        System.out.print("Enter The Size (p): ");
        int p=scan.nextInt();
        int A[]=new int[p];
        int i,j;
        System.out.print("Enter The Array Element: ");
        for(i=0;i<p;i++){
            A[i]=scan.nextInt();
        }

        System.out.println("Enter The B Array:");
        System.out.print("Enter The Size (q): ");
        int q=scan.nextInt();
        int B[]=new int[q];
        System.out.print("Enter The Array Element: ");
        for(i=0;i<q;i++){
            B[i]=scan.nextInt();
        }
        int size=p+q;
        int C[]=new int[size];
        for(i=0;i<p;i++){
            C[i]=A[i];
        }
        j=i;
        for(i=0;i<q;i++){
            C[j++]=B[i];
        }

        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(C[i]>C[j]){
                    int temp=C[i];
                    C[i]=C[j];
                    C[j]=temp;
                }
            }
        }
        for(i=0;i<p;i++){
            A[i]=C[i];
        }
        int k=i;
        for(i=0;i<q;i++){
            B[i]=C[k++];
        }
        System.out.println();
        System.out.println("Array A:");
        for(i=0;i<p;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("Array B:");
        for(i=0;i<q;i++){
            System.out.print(B[i]+" ");
        }
        scan.close();
    }
}
