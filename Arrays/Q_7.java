//Write a Java program to sort a numeric array and a string array.

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1 - numeric array");
        System.out.println("2 - string array");
        System.out.print("Enter The Choice: ");
        int choice=scan.nextInt();
        System.out.print("Enter The Size: ");
        int size=scan.nextInt();
        switch (choice){
            case 1:
                int arr[]=new int[size];
                System.out.print("Enter The Array Element: ");
                for(int i=0;i<size;i++){
                    arr[i]=scan.nextInt();
                }
                numericarray(arr,size);
                break;
            case 2:
                String str[]=new String[size];
                System.out.print("Enter The Array Element: ");
                for(int i=0;i<size;i++){
                    str[i]=scan.next();
                }
                stringarray(str,size);
                break;
        }
        scan.close();
    }

    static  void numericarray(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Ans: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static  void  stringarray(String arr[],int size){
        int i,j,k;
        for(k=0;k<size-1;k++){
            for(i=k+1;i<size;i++){
                int len1=arr[i].length();
                int len2=arr[k].length();
                int min=(len1<=len2)?len1:len2;
                for(j=0;j<min;j++){
                    if((arr[k].charAt(j)) > (arr[i].charAt(j))){
                        String temp=arr[k];
                        arr[k]=arr[i];
                        arr[i]=temp;
                        break;
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println("Ans: ");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
