//Write a program to check whether the given number is a Prime number or not.

import  java.util.Scanner;

class  Q_8{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		System.out.print("Enter The Number: ");
        int number=scan.nextInt();
		int flag=0;
        if(number<2)
			flag=1;
		for(int i=2;i<Math.sqrt(number);i++){
			if(number%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println(number+" Is a Prime Number");
		else
			System.out.println(number+" Is a Not Prime Number");
		scan.close();
    }
}