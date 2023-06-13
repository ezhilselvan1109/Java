/*
Create a BMI calculator by using packages and it should follows,

->> Create a package file 1 that contains a class that accepting a basic data members need for your calculator

->> Create a crisp method to calculate a BMI and return the result

->>Create another package file and create an object for the file 1 class and pass the respective arguments
    then call the method
 */
package file;

import file1.*;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Height: ");
        float height=scanner.nextFloat();
        System.out.print("Enter The Weight: ");
        int weight=scanner.nextInt();
        Calculator calculator=new Calculator(height,weight);
        System.out.println("Ans: "+String.format("%.2f", calculator.getBMI()));

    }
}