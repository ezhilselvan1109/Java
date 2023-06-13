/*Write a program to print the following Patterns.
		 2
        2 2 2
	  2 0 2 0 2
	2 0 0 2 0 0 2
		*/
		
import java.util.*;

class Q12a{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter  The Number: ");
		int number=scan.nextInt();
		int i,j,k,l;
		for(i=number;i>0;i--){
			for(j=0;j<i-1;j++){
				System.out.print("  ");
			}
			for(k=++j;k<=number;k++){
				if(k==j || k==number)
					System.out.print(" 2");
				else
					System.out.print(" 0");
			}
			for(l=i;l<number;l++){
				if(l==number-1)
					System.out.print(" 2");
				else
					System.out.print(" 0");
			}
			System.out.println();
		}
		scan.close();
	}
}