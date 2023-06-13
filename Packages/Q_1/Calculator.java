/*
Create a BMI calculator by using packages and it should follows,

->> Create a package file 1 that contains a class that accepting a basic data members need for your calculator

->> Create a crisp method to calculate a BMI and return the result

->>Create another package file and create an object for the file 1 class and pass the respective arguments
    then call the method
 */

package file1;

public class Calculator {
    private int weight;
    private float height;
    public Calculator(float height,int weight){
        this.weight=weight;
        this.height=height;
    }
    public float getBMI() {
        return (float)weight/(height*height);
    }
}