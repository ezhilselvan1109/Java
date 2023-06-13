//Write a program to illustrate how to throw an ArrayOutOfBoundException.
import java.util.Scanner;

public class Q_8 {
    public static void main(String a[]){
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("Enter The Array Size: ");
            int size=scan.nextInt();
            int arr[]=new int[size];
            System.out.print("Enter The Array Element : ");
            for(int i=0;i<size;i++){
                arr[i]=scan.nextInt();
            }
            System.out.print("Enter The Array Index: ");
            int index=scan.nextInt();
            System.out.println("Index: "+index +" = "+arr[index]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
    }
}
