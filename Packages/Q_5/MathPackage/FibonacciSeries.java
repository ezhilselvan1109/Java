package MathPackage;

public class FibonacciSeries {
    public void fibonacciSeries(int number){
        int first=0,second=1,third;
        System.out.print(first+" ");
        while (number-1>0){
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            number--;
        }
    }
}