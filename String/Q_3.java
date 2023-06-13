//Write a Java program to compare two strings lexicographically, ignoring case differences


import java.util.*;

class Q_3{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter The first String: ");
	String str1=scan.next();
	System.out.print("Enter The Second String: ");
	String str2=scan.next();
	int result = str1.compareToIgnoreCase(str2);
	if (result < 0){
        System.out.println("\"" + str1 + "\"" +" is less than " +"\"" + str2 + "\"");
    }else if (result == 0){
		System.out.println("\"" + str1 + "\"" +" is equal to " +"\"" + str2 + "\"");
    }else{
		System.out.println("\"" + str1 + "\"" +" is greater than " +"\"" + str2 + "\"");
	}
	}
}