//Program to find the Fibonacci series till the given number of terms.

import java.util.Scanner;

class Fibonacci{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int number=scan.nextInt();
		int first=0,second=1,third;
		System.out.print("Fibonacci Series: ");
		for(int i=1;i<=number;i++){
			third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
		scan.close();
	}
}