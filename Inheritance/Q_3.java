//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
// and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract
// method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the
// same name which returns the percentage of the students. The constructor of student A takes the marks
// in three subjects as its parameters and the marks in four subjects as its parameters for student B.
// Create an object for each of the two classes and print the percentage of marks for both the students.


abstract class Marks{
    public abstract void getPercentage();
}

class A extends Marks{
    int mark1,mark2,mark3;
    public A(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public void getPercentage(){
        System.out.println("Student B Percentage: "+(mark1+mark2+mark3)/3);
    }
}

class B extends Marks{
    int mark1,mark2,mark3,mark4;
    public B(int mark1,int mark2,int mark3,int mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }
    public void getPercentage(){
        System.out.println("Student B Percentage: "+(mark1+mark2+mark3+mark4)/4);
    }
}

public class Main {
    public static void main(String[] args) {
        A Aobj=new A(10,20,30);
        Aobj.getPercentage();
        B Bobj=new B(10,20,30,40);
        Bobj.getPercentage();
    }
}