package superMarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMarketService {
    static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        start();
    }

    public static void start() throws IOException, ClassNotFoundException {
        Admin admin=new Admin();
        Customer customer=new Customer();
        while (true){
            System.out.println("\t\t\t\t1 - Admin");
            System.out.println("\t\t\t\t2 - Customer");
            System.out.println("\t\t\t\t3 - Exit");
            System.out.print("Enter The Choice: ");
            int choice=Integer.parseInt(reader.readLine());
            switch (choice){
                case 1:
                    admin.adminMain();
                    break;
                case 2:
                    customer.customerEntry();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

}
