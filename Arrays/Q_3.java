//To find the second largest number.

import java.util.*;

class Q_3{
    public static void main(String[] args) {        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter The Array Element: ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int max=0;
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
		}
		int temp=max;
		max=0;
		for(int i=0;i<size;i++){
            if(max<arr[i]){
                if(temp!=arr[i]){
                    max=arr[i];
                }
            }
		}
		System.out.println("SecondMAx is"+max);
        scan.close();
    }
}