//    Write a Java program to print all the LEADERS in the array.   

//Note: An element is leader if it is greater than all the elements to its right side

import java.util.*;

class Q_10{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter The Array Element: ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            boolean flag=true;
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    flag=false;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
        scan.close();
    }
		
}
