package MathPackage;

public class SumofNNumbers {
    public int sumofNNumbers(int num){
        int sum=0;
        while (num>0){
            sum+=num;
            num--;
        }
        return sum;
    }
}