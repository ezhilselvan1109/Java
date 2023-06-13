//Write a program to illustrate usage of try/catch with finally clause.
import java.util.Scanner;

public class Q_5
{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
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
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception caught in catch block");
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}