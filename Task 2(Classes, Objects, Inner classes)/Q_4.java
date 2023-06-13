//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.Scanner;

class Average{
    private int number1,number2,number3,average;
    public Average(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Number1: ");
        number1=scan.nextInt();
        System.out.print("Enter The Number2: ");
        number2=scan.nextInt();
        System.out.print("Enter The Number3: ");
        number3=scan.nextInt();
    }
    public  void Calculate(){
        average=(number1+number2+number3)/3;
        System.out.println("Average: "+average);
    }
    public static void main(String[] args) {
        Average obj = new Average();
        obj.Calculate();
    }
}