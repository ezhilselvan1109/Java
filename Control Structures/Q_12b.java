/*Write a program to print the following Patterns.
		5
		4 5
		3 4  5
		2 3  4  5
        1 2  3  4  5
		*/
		
import java.util.*;

class Q12b{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter  The Number: ");
		int number=scan.nextInt();
		for(int i=number;i>0;i--){
			for(int j=i;j<=number;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}