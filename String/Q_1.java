//Write a Java program to get the character at the given index within the String.

import java.util.*;

class Q_1{
	public static void main(String []args){
		System.out.print("Enter The String: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.print("Enter The Index Number: ");
		int index=scan.nextInt();
		System.out.print("The character at position "+index+" is "+str.charAt(index));
	}
}