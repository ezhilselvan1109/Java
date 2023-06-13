import java.io.*;

@SuppressWarnings("unchecked")
public class Hotel  implements Serializable{
    private String hotelName;
    private int hotelId;
    private String itemName;
    private int price;
    private int itemId;

    public Hotel(String hotelName, int hotelId, String itemName, int price, int itemId) {
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.itemName = itemName;
        this.price = price;
        this.itemId = itemId;
    }

    public String gethotelName() {
        return hotelName;
    }

    public int gethotelId() {
        return hotelId;
    }

    public int getItemId() {
        return itemId;
    }
    public Hotel(){

    }
    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

}
