//Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively.
// 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having
// a method named 'getBalance'. Call this method by creating an object of each of the three classes.

abstract class Bank{
    public abstract void getBalance();
}
class BankA extends Bank{
    int balance=100;
    public void getBalance(){
        System.out.println("Balance: "+balance);
    }
}
class BankB extends Bank{
    int balance=150;
    public void getBalance(){
        System.out.println("Balance: "+balance);
    }
}
class BankC extends Bank{
    int balance=200;
    public void getBalance(){
        System.out.println("Balance: "+balance);
    }
}

public class Q_2 {
    public static void main(String[] args) {
        BankA objA=new BankA();
        objA.getBalance();
        BankB objB=new BankB();
        objB.getBalance();
        BankC objC=new BankC();
        objC.getBalance();
    }
}