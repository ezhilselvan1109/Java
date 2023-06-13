import MathPackage.*;

import java.util.*;


public class Driverprogram{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        while (true) {
            System.out.println("\t\t\t1 - Arithmetic Operations\n\t\t\t2 - Factorial\n\t\t\t3 - Fibonacci Series\n\t\t\t4 - SumofNNumbers\n\t\t\t5 - SumofDigitInANumber\n\t\t\t6 - Exit");
            System.out.print("Enter The Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    arithmeticOperations();
                    break;
                case 2:
                    factorial();
                    break;
                case 3:
                    fibonacciSeries();
                    break;
                case 4:
                    sumofNNumbers();
                    break;
                case 5:
                    sumofDigitInANumber();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }
    public static void arithmeticOperations(){
        int firstNumber,secondNumber;
        boolean flag=false;
        ArithmeticOperations arithmeticOperations=new ArithmeticOperations();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("\t\t\t1 - Addition\n\t\t\t2 - Subtraction\n\t\t\t3 - Multiplication\n\t\t\t4 - Division\n\t\t\t5 - Modulus\n\t\t\t6 - Back\n\t\t\t7 - Exit");
            System.out.print("Enter The Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter The First Number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Enter The Second Number: ");
                    secondNumber= scanner.nextInt();
                    System.out.println("\t\t\tAddition: " + arithmeticOperations.addition(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.print("Enter The First Number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Enter The Second Number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("\t\t\tSubtraction: " + arithmeticOperations.subtraction(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.print("Enter The First Number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Enter The Second Number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("\t\t\tMultiplication: " + arithmeticOperations.multiplication(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.print("Enter The First Number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Enter The Second Number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("\t\t\tDivision: " + arithmeticOperations.division(firstNumber, secondNumber));
                    break;
                case 5:
                    System.out.print("Enter The First Number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Enter The Second Number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("\t\t\tModulus: " + arithmeticOperations.modulus(firstNumber, secondNumber));
                    break;
                case 6:
                    flag=true;
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
            if(flag){
                break;
            }
        }
    }
    public static void factorial(){
        Scanner scanner=new Scanner(System.in);
        Factorial factorial=new Factorial();
        System.out.print("Enter The Number: ");
        int num=scanner.nextInt();
        System.out.println("\t\t\tAns: "+factorial.factorial(num));
    }

    public static void fibonacciSeries(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=scanner.nextInt();
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        System.out.print("\t\t\tAns: ");
        fibonacciSeries.fibonacciSeries(num);
    }
    public static void sumofNNumbers(){
        Scanner scanner=new Scanner(System.in);
        SumofNNumbers sumofNNumbers=new SumofNNumbers();
        System.out.print("Enter The Number: ");
        int num=scanner.nextInt();
        System.out.println("\t\t\tAns: "+sumofNNumbers.sumofNNumbers(num));
    }
    public static void sumofDigitInANumber(){
        Scanner scanner=new Scanner(System.in);
        SumofDigitInANumber sumofDigitInANumber=new SumofDigitInANumber();
        System.out.print("Enter The Number: ");
        int num=scanner.nextInt();
        System.out.println("\t\t\tAns: "+sumofDigitInANumber.sumofDigitInANumber(num));
    }

}
