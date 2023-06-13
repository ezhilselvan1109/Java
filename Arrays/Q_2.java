//To search an element from an array by linear search method.


import java.util.*;

class Q_2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int Size=scan.nextInt();
        int arr[]=new int[Size];
        System.out.print("Enter The Element: ");
        for(int i=0;i<Size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter The Number: ");
        int number=scan.nextInt();
        for(int i=0;i<Size;i++){
            if(number==arr[i]){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
        scan.close();
    }
}