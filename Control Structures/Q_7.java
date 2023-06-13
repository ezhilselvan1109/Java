//ax2 + bx + c = 0

// Write a program to calculate the roots of Quadratic equations.
import java.util.Scanner;
import java.lang.Math;

class Q7_Quadratic{
	static int a,b,c;
	public static void readInput(){
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the a value :");
        a = scan.nextInt();
        System.out.print("Enter the b value :");
        b = scan.nextInt();
        System.out.print("Enter the c value :");
        c= scan.nextInt();
	}
    public static double Calculate(){
        double result = Math.sqrt(Math.pow(b,2) - (4*a*c));
        return result;
    }
    public static void main(String args[]){
        readInput();
        double denominator = 2 * a;
        double numerator1 = -b+Calculate();
        double numerator2 = -b-Calculate();
        double result1 = numerator1/denominator;
        double result2 = numerator2/denominator;
        System.out.println("X = "+result1);
        System.out.println("X = "+result2);   
      }
}