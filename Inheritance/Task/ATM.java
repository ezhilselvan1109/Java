//Create a Automated Teller Machine Backend Logic using Encapsulation technique in Java

import java.util.Scanner;

public class Main{
    static Atm AtmObj=new Atm();
    public static void main(String[] args) {
        Customer customerArr[]=new Customer[2];
        customerArr[0]=new Customer("ezhil",1234567890,1234,638240460,"SBI",25000);
        customerArr[1]=new Customer("selvan",1234512345,5678,979564541,"ICICI",20000);
        login(customerArr);
    }
    public static void login(Customer customerArr[]){
        System.out.println("\t\t\tWelcome To ATM");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Account No: ");
        long account_no= Long.parseLong(scan.next());
        System.out.print("Enter The Pin: ");
        int pin= Integer.parseInt(scan.next());
        boolean flag=true;
        for(int i=0;i<2;i++){
            if(account_no==customerArr[i].getAccountNo() && pin==customerArr[i].getPIN()){
                System.out.println("\t\t\tLogin Success Full\n");
                System.out.println("\t\t\t    "+customerArr[i].getBankName());
                System.out.println("\t\t\tWelcome "+customerArr[i].getName().toUpperCase()+"\n");
                Successlogin(customerArr,i);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Wrong Pin and Account No !");
        }
    }
    public static void Successlogin(Customer customerArr[],int i){
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.print("\t\t\t1 - withdraw\n\t\t\t2 - deposit\n\t\t\t3 - Check Balance\n\t\t\t0 - Exit\nEnter The Choice: ");
            int choice=scan.nextInt();
            switch (choice){
                case 1:
                    AtmObj.withDraw(customerArr,i);
                    break;
                case 2:
                    AtmObj.deposit(customerArr,i);
                    break;
                case 3:
                    AtmObj.CheckBalance(customerArr,i);
                    break;
                case 0:
                    System.out.println("\t\t\tExit");
                    System.exit(0);
                    break;
            }
        }
    }
}
class Customer{
    private String name,bankName;
    private long accountNo,phoneNo;
    private int balance,PIN;
    public Customer(String name,long accountNo,int PIN,long phoneNo,String bankName,int balance){
        this.name=name;
        this.accountNo=accountNo;
        this.phoneNo=phoneNo;
        this.PIN=PIN;
        this.balance=balance;
        this.bankName=bankName;
    }
    public String getName() {
        return name;
    }
    public String getBankName() {
        return bankName;
    }
    public long getAccountNo() {
        return accountNo;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getPIN() {
        return PIN;
    }
}

class Atm{
    public void withDraw(Customer CustomerArr[],int i){
        while (true) {
            System.out.print("Enter The Amout For Withdraw: ");
            Scanner scan = new Scanner(System.in);
            int withdrew = scan.nextInt();
            if (withdrew <= 1000) {
                if (CustomerArr[i].getBalance() >= withdrew) {
                    int Amout = CustomerArr[i].getBalance() - withdrew;
                    CustomerArr[i].setBalance(Amout);
                    System.out.println("\t\t\tSucess Full Withdraw");
                } else {
                    System.out.println("\t\t\tInSuffent Balance");
                }
            } else {
                System.out.println("\t\t\tSorry ! \n\t\t\tLimit is 1000");
            }
            System.out.print("(1) - Back");
            int back=scan.nextInt();
            if(back==1){
                break;
            }
        }
    }

    public void deposit(Customer customerArr[],int i){
        while (true) {
            System.out.print("Enter The Amount For deposit: ");
            Scanner scan = new Scanner(System.in);
            int depositAmount = scan.nextInt();
            depositAmount += customerArr[i].getBalance();
            customerArr[i].setBalance(depositAmount);
            System.out.println("\t\t\tSucess Full Deposit\n");
            System.out.print("(1) - Back");
            int back=scan.nextInt();
            if(back==1){
                break;
            }
        }
    }

    public void CheckBalance(Customer CustomerArr[],int i){
        while (true) {
            System.out.println("\t\t\tBalance: " + CustomerArr[i].getBalance()+"\n");
            System.out.print("(1) - Back");
            Scanner scan=new Scanner(System.in);
            int back=scan.nextInt();
            if(back==1){
                break;
            }
        }

    }
}

