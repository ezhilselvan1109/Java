//Write a Java program to replace every element with the next greatest element (from right side) in
// a given array of integers. There is no element next to the last element, therefore replace it with -1


import java.util.*;

class Q_12{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int Size=scan.nextInt();
        int arr[]=new int[Size];
        System.out.print("Enter The Array Element: ");
        for(int i=0;i<Size;i++){
            arr[i]=scan.nextInt();
        }
        int i,j;
        for(i=0;i<Size;i++){
            int max=Integer.MIN_VALUE;
            for(j=i+1;j<Size;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[Size-1]=-1;
        System.out.print("Ans: ");
        for(i=0;i<Size;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}
//{45, 20, 100, 23, -5, 2, -6};
//[100, 100, 23, 2, 2, -6, -1]