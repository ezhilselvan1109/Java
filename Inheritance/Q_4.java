//Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
// Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a
// class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
// Now create an object for each of the subclasses and call their respective methods.

abstract class Animals{
     abstract void cats();
     abstract void dogs();
}

class Cats extends Animals{
    public void cats(){
        System.out.println("Cats meow");
    }
    public void dogs(){
    }
}

class Dogs extends Animals{
    public void dogs(){
        System.out.println("Dogs bark");
    }
    public void cats(){

    }
}
public class Main {
    public static void main(String[] args) {
        Cats Catsobj=new Cats();
        Catsobj.cats();
        Dogs Dogsobj=new Dogs();
        Dogsobj.dogs();
    }
}