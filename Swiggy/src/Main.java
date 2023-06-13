/*
1.Create a food order application as like Swiggy. The algorithm must be designed with respective to the following concepts in java,
        1.Abstraction
        2.Encapsulation
        3.Methods
        4. File System
        5.Regex
        6.Class Object
        7.Linked list and Hashmap
        8.MultiThreading
*/
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {
    public static  void main(String[] args) throws IOException, ClassNotFoundException {
        HotelService hotel=new HotelService();
        CustomberService customer=new CustomberService();
        Delivery_Man delivery_man=new Delivery_Man();
        Scanner scanner=new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1 - Hotel");
            System.out.println("2 - Customer");
            System.out.println("3 - Delivery Man");
            System.out.println("4 - Exit");
            System.out.print("Enter The Choice: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    hotel.hotelMenu();
                    break;
                case 2:
                    customer.customerMenu();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
