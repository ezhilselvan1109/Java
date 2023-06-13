//Write a program to find the sum of digits and the reverse of the given number.

import java.util.Scanner;

class Q_10{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int number=scan.nextInt();
		int sum=0,reverse=0;
		while(number!=0){
			sum+=number%10;
			reverse=number%10+reverse*10;
			number/=10;
		}
		System.out.println("sum of digits: "+sum);
		System.out.print("reverse of the given number: "+reverse);
		scan.close();
	}
}