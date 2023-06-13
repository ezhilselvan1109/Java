//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a
// class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as
// parameters to its constructor.

class Rectangle{
    private  int length,breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle(4,5);
        System.out.println("first rectangles: "+obj1.area());
        Rectangle obj2=new Rectangle(5,8);
        System.out.println("Second rectangles: "+obj2.area());
    }
}