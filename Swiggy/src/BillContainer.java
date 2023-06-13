import java.io.*;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class BillContainer {
    private String CustomerName;
    private String CustomerPhoneNo;
    private String CustomerAddress;
    private String itemName;
    private int price;
    private int itemId;

    public LinkedList<HotelBill> hotelBills=new LinkedList<>();
    public void writeFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\Java\\Application\\Swiggy\\Files\\HotelBills.txt"));
        os.writeObject(hotelBills);
        os.close();
    }

    public  LinkedList<HotelBill> getObject() throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:\\Java\\Application\\Swiggy\\Files\\HotelBills.txt"));
        hotelBills=(LinkedList<HotelBill>) is.readObject();
        is.close();
        return hotelBills;
    }

    public void getBill() throws IOException, ClassNotFoundException {
        hotelBills=getObject();
        for(HotelBill hotelBill:hotelBills){
            System.out.println(hotelBill.getCustomerName()+" "+hotelBill.getCustomerPhoneNo()+" "+hotelBill.getCustomerAddress()+" "+hotelBill.getItemId()+" "+hotelBill.getItemName()+" "+hotelBill.getPrice());
        }
    }
}
