/*
Write a program to illustrate how to throw a ClassNotFoundException.
*/

public class Q_9 {
    public static void main(String[] args) {
        try {
            Class.forName("Q_91");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
