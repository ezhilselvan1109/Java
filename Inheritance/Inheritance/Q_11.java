/*
Write a program to create interface A, in this interface we have two method method1 and method2.
Implements this interface in another class named MyClass.
*/

interface A
{
    void meth1();
    void meth2();
}
interface B extends A
{
    void meth3();
}
class MyClass implements B
{
    public void meth1 ( )
    {
        System.out.println("Implement meth1().");
    }
    public void meth2()
    {
        System.out.println ("Implement meth2().");
    }
    public void meth3()
    {
        System.out.println ("Implement meth().");
    }
}
class IFExtend
{
    public static void main(String arg[])
    {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
