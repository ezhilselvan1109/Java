//(L2)Write a program to get the reference to the current thread by calling currentThread() method.

public class Q_3 {
    public static void main(String[] args) {
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        TheadClass theadClass=new TheadClass();
        theadClass.setName("Thread-1");
        theadClass.start();
    }
}

class TheadClass extends Thread{
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread().getName());
    }
}

