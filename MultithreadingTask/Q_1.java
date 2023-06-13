/*
(L2)Write a program to illustrate creation of threads using runnable class.
(start method start each of the newly created thread.
Inside the run method there is sleep() for suspend the thread for 500 milliseconds).
*/

public class Q_1 {
    public static void main(String[] args) {
        ThreadClass threadClass=new ThreadClass();
        Thread thread=new Thread(threadClass);
        thread.start();
    }
}
class ThreadClass implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Printing...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


