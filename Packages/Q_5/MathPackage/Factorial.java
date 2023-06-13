package MathPackage;

public class Factorial {
    public int factorial(int number){
        int sum=1;
        while (number>0){
            sum*=number;
            number--;
        }
        return sum;
    }
}