import java.util.Scanner;

/*
Write a program for creation of user defined exception.
 */
public class Q_7 {
    static void checkAge(int age) {
        try {
            if (age < 18) {
                throw new MyException("Access denied - You must be at least 18 years old.");
            }else {
                System.out.println("Access granted - You are old enough!");
            }
        }
        catch(MyException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=scan.nextInt();
        checkAge(num);
    }
}

class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
