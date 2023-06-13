//To find greatest among three numbers

import java.util.*;

class Q_4{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int first,second,third;
		System.out.print("Enter The First Number: ");
		first=scan.nextInt();
		System.out.print("Enter The Second Number: ");
		second=scan.nextInt();
		System.out.print("Enter The Third Number: ");
		third=scan.nextInt();
		System.out.print("greatest Number: ");
		if(second<first && third<first)
			System.out.print(first);
		else if(first<second && third<second)
			System.out.print(second);
		else
			System.out.print(third);
		scan.close();
	}
}