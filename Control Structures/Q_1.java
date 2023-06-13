//To check character is uppercase, lowercase alphabet or a digit or a special symbol.
import java.util.Scanner;

class Q_1{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter The Character: ");
	char ch=scan.next().charAt(0);
	System.out.print(ch);
	if(48<=ch && ch<=57)
		System.out.print("It's digit");
	else if(65<=ch && ch<=90)
		System.out.print("It's uppercase");
	else if(97<=ch && ch<=122)
		System.out.print("It's lowercase");
	else 
		System.out.print("It's special symbol");
	scan.close();
	}
}