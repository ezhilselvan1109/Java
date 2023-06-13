/*Print the following structure, use the break and continue statement with loops in Java.
 *
 ***
 *****
 ***
 *
 */

import java.util.Scanner;

class Q_11{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=scan.nextInt();
        for(int i=1;i<=num;i+=2){
	        for(int j=1;j<=num;j++){
	            if(j<=i){
	                System.out.print("*");
	            }
	            else if(j==num){
	                break;
	            }
	            else{
	                continue;
	            }
	        }
	        System.out.println();
	    }
	    for(int i=num-2;i>=1;i-=2){
	        for(int j=1;j<=num;j++){
	            if(j<=i){
	                System.out.print("*");
	            }
	            else if(j==1){
	                break;
	            }
	            else{
	                continue;
	            }
	        }
	        System.out.println();
	    }
        scan.close();
    }
}

