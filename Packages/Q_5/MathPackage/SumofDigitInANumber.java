package MathPackage;

public class SumofDigitInANumber {
    public int sumofDigitInANumber(int number){
        int sum=0;
        while (number>0){
            int temp=number/10;
            sum+=temp;
            number%=10;
        }
        return sum;
    }
}