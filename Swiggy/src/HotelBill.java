import java.io.Serializable;

@SuppressWarnings("unchecked")
public class HotelBill implements Serializable {
    private String CustomerName;
    private String CustomerPhoneNo;
    private String CustomerAddress;
    private String itemName;
    private int price;
    private int itemId;
    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerPhoneNo() {
        return CustomerPhoneNo;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getItemId() {
        return itemId;
    }

    public HotelBill(String customerName, String customerPhoneNo, String customerAddress, String itemName, int price, int itemId) {
        CustomerName = customerName;
        CustomerPhoneNo = customerPhoneNo;
        CustomerAddress = customerAddress;
        this.itemName = itemName;
        this.price = price;
        this.itemId = itemId;
    }
}
