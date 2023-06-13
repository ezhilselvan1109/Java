/*
Create class Point with the following instance variables and methods.

    Instance variable: private int x,y

    Constructors : public Point(), Point(int x, int y)

    Methods : public void setX(int x), setY(int y), setXY(int x, int y), int getX(), int getY().

*/

class Point {
    private int x,y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }
}


class Mainn{
    public static void main(String[] args) {
        Point point=new Point();
        point.setX(5);
        point.setY(6);
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.setXY(5,6);
        System.out.println(point.getX());
        System.out.println(point.getY());

    }
}
