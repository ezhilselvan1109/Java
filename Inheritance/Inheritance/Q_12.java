/*
Write a program to create an interface named test. In this interface write a member function named square.
Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class.
*/

interface test{
    int square();
}

class Arithmetic implements test{
    int b;
    Arithmetic(int x){
        b = x;
    }
    public int square(){
        return (b*b);
    }
}

class ToTestInt{
    public int return_ans(int x)
    {
        Arithmetic obj=new Arithmetic(x);
        return obj.square();
    }
}

class Main{
    public static void main(String []args)
    {
        ToTestInt obj= new ToTestInt();
        System.out.println("The square of 64 is "+obj.return_ans(64));
    }
}