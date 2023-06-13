import java.io.*;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class CustomberService {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    LinkedList<Customer> customer=new LinkedList<>();
    HotelService hotelService=new HotelService();

    private String CustomerName;
    private String CustomerPhoneNo;
    private String CustomerAddress;
    BillContainer billContainer=new BillContainer();
    private int hotelId;
    public void customerMenu() throws IOException, ClassNotFoundException {
        int choice;
        while (true) {
            boolean back=false;
            System.out.println("\t\t\t\t1 - SignUp");
            System.out.println("\t\t\t\t2 - SignIn");
            System.out.println("\t\t\t\t3 - Bills");
            System.out.println("\t\t\t\t4 - Back");
            System.out.print("Enter The Choice: ");
            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    signUp();
                    break;
                case 2:
                    readFile();
                    signIn();
                    break;
                case 3:
                    billContainer.getBill();
                    break;
                /*case 4:
                    System.exit(0);
                    break;*/
                case 4:
                    back = true;
                    break;
            }
            if(back){
                break;
            }
        }
    }

    private void signIn() throws IOException, ClassNotFoundException {
        System.out.print("Enter The Phone No: ");
        String phoneNo=reader.readLine();
        customer = getObject();
        for (Customer itr : customer) {
            if(phoneNo.equals(itr.getPhNo())){
                CustomerName=itr.getName();
                CustomerPhoneNo= itr.getPhNo();
                CustomerAddress=itr.getAddress();
                System.out.println("Login Success Full!");
                getHotelList();
            }
        }
    }
    private void getHotelList() throws IOException, ClassNotFoundException {
        hotelService.getHotel();
        System.out.print("Enter The Hotel ID: ");
        hotelId=Integer.parseInt(reader.readLine());
        selectItems();
    }

    private void selectItems() throws IOException, ClassNotFoundException {
        System.out.print("Enter The Item ID Number: ");
        int id=Integer.parseInt(reader.readLine());
        LinkedList<Hotel> hotels = hotelService.getObject();
        System.out.println("Item Name\tPrice\tId");
        boolean back=true;
        while (back) {
            for (Hotel itr : hotels) {
                if (id == itr.getItemId() && hotelId== itr.gethotelId()) {
                    System.out.printf("%-11s%-9d%-10d", itr.getItemName(), itr.getPrice(), itr.getItemId());
                    System.out.println();
                    billContainer.hotelBills.add(new HotelBill(CustomerName,CustomerPhoneNo,CustomerAddress,itr.getItemName(),itr.getPrice(),itr.getItemId()));
                    billContainer.writeFile();
                    System.out.print("1 - Continue\t");
                    System.out.println("2 - Place The Order");
                    System.out.println("Enter The Choice :");
                    int choice = Integer.parseInt(reader.readLine());
                    if (choice == 2) {
                        placeOrder();
                        back =false;
                    }else{
                        selectItems();
                    }
                }
            }
        }
    }
    private void placeOrder(){
        System.out.println("Placed Order");
    }
    private void signUp() throws IOException {
        System.out.print("Enter The Name: ");
        String name = reader.readLine();
        System.out.print("Enter The Phone No: ");
        String phoneNo =reader.readLine();
        System.out.print("Enter The Address: ");
        String address = reader.readLine();
        customer.add(new Customer(name, phoneNo, address));
        writeToFile();
    }

    public void readFile() throws ClassNotFoundException, IOException {
        customer=getObject();
        System.out.println("Name\tPHoneNo\tAddress");
        for (Customer itr : customer) {
            System.out.printf("%-11s%-11s%-10s",itr.getName(),itr.getPhNo(),itr.getAddress());
            System.out.println();
        }
    }

    public void writeToFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\Java\\Application\\Swiggy\\Files\\Customer.txt"));
        os.writeObject(customer);
        os.close();
    }

    public  LinkedList<Customer> getObject() throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:\\Java\\Application\\Swiggy\\Files\\Customer.txt"));
        customer=(LinkedList<Customer>) is.readObject();
        is.close();
        return customer;
    }
}
