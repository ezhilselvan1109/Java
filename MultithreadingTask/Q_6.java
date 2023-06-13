/*
(L3)Create a multithreaded program as in the previous exercise by creating the MyThread subclass of Thread. 
But create threads as objects of the class MyClass, which is not a subclass of Thread. MyClass will implement 
the runnable interface and objects of MyClass will be executed as threads by passing them as arguments to the 
Thread constructor.
*/

import java.lang.Thread;

class Q_6
{
    public static void main (String args[ ])
    {
        Thread thread1 = new Thread (new MyClass ("thread1:") );
        Thread thread2 = new Thread (new MyClass ("thread2:") );
        thread1.start ( );
        thread2.start ( );
        boolean thread1IsAlive = true;
        boolean thread2IsAlive = true;
        do {
            if (thread1IsAlive && !thread1.isAlive ( ) )
            {
                thread1IsAlive = false;
                System.out.println ("Thread 1 is dead.");
            }
            if (thread2IsAlive && !thread2.isAlive ( ))
            {
                thread2IsAlive = false;
                System.out.println ("Thread 2 is dead.");
            }
        } while (thread1IsAlive || thread2IsAlive );
    }
}
class MyClass implements Runnable
{
    static String message[] = {"Java is hot", "Java is aromatic","Java is invigorating."};
    String name;
    public MyClass (String id){
        name = id;
    }
    public void run(){
        for (int i =0;i<message.length;++i)
        {
        randomWait();
        System.out.println (name + message[i]) ;
        }
    }

    void randomWait(){
        try
        {
            Thread.currentThread ().sleep((long)(1000*Math.random()));
        }
        catch (InterruptedException x)
        {
        System.out.println ("Interrupted !");
        }
    }
}
