/*
(L3)Create a multithreaded program by creating a subclass of Thread and then creating,
initializing, and staring two Thread objects from your class. The threads will execute concurrently
and display Java is hot, aromatic, and invigorating to the console window.
*/

import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
class ThreadTest1
{
    public static void main (String args [ ])
    {
        MyThread thread1 = new MyThread ("thread1:");
        MyThread thread2 = new MyThread ("thread2:");
        thread1.start ( );
        thread2.start ( );
        boolean thread1IsAlive = true;
        boolean thread2IsAlive = true ;
        do
        {
            if (thread1IsAlive && !thread1.isAlive ( ) )
            {
                thread1IsAlive = false;
                System.out.println ("Thread1 is dead.");
            }
            if (thread2IsAlive && ! thread2.isAlive ( ))
            {
                thread2IsAlive = false;
                System.out.println ("Thread 2 is dead.");
            }
        }while (thread1IsAlive || thread2IsAlive);
    }
}
class MyThread extends Thread
{
    static String message[] = {"Java is hot", "Java is aromatic","Java is invigorating."};
    public MyThread (String id){
        super (id);
    }
    public void run(){
        String name = getName ( );
        for (int i=0;i<message.length; ++i )
        {
        randomWait();
        System.out.println (name + message[i] );
        }
    }
    void randomWait( ){
        try
        {
        	Thread.currentThread ().sleep((long)(1000*Math.random()));
        }
        catch (InterruptedException x )
        {
        	System.out.println ("Interrupted!");
        }
    }
}
