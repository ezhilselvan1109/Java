//To calculate factorial of a given number.


import java.util.*;

class Q_5{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int number=scan.nextInt();
		int sum=1;
		while(number!=0){
			sum*=number;
			number--;
		}
		System.out.print("Factorial: "+sum);
		scan.close();
	}
}