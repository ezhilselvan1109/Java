//Find the Sum of two operands with various datatypes using function overloading.

import java.util.*;

class Q_1{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int number1,number2,char1,char2;
            System.out.println("1 - int\n2 - char\n3 - int,char\n4 - Exit");
            System.out.print("Enter The Choice: ");
            int choice=scan.nextInt();
            switch(choice){
                case 1:
                System.out.print("Enter The First Number: ");
                number1=scan.nextInt();
                System.out.print("Enter The Second Number: ");
                number2=scan.nextInt();
                sum(number1,number2);
                break;
                case 2:
                System.out.print("Enter The First Char: ");
                char1=scan.next().charAt(0);
                System.out.print("Enter The Second Char: ");
                char2=scan.next().charAt(0);
                sum(char1,char2);
                break;
                case 3:
                System.out.print("Enter The Number: ");
                number1=scan.nextInt();
                System.out.print("Enter The Char: ");
                char2=scan.next().charAt(0);
                sum(number1,char2);
                break;
                case 4:
                    System.exit(0);
            }
        }
    }
    
    static void sum(int first,int second){
        System.out.print("Ans: ");
        System.out.println(first+second);
    }
    static void sum(char char1,char char2){
        System.out.print("Ans: ");
        System.out.println((int)char1+(int)char2);
    }
    static void sum(int first,char char1){
        System.out.print("Ans: ");
        System.out.println(first+(int)char1);
    }
}