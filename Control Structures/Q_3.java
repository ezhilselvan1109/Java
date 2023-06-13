//Find the Factorial of a number even when the user is not provided input for n=5(default value).

import java.util.Scanner;

class Q_3{
	public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int n=0;
	System.out.println("1 - Default Value");
	System.out.println("2 - User Input");
	int choice=scan.nextInt();
	if(choice==1){
		n=5;
	}else if(choice==2){
		System.out.print("Enter The Value: ");
		n=scan.nextInt();
	}
	int sum=1;
	int temp=n;
	while(n!=0){
		sum*=n;
		n--;
	}
	System.out.print(temp+"Factorial: "+sum);
	scan.close();
	}
	
}