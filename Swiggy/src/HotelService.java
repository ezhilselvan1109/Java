import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@SuppressWarnings("unchecked")
public class HotelService {
    LinkedList<Hotel> hotels = new LinkedList<>();
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

    /*public static void main(String[] args) throws IOException, ClassNotFoundException {
        HotelService hotelService= new HotelService();
        hotelService.hotelMenu();
    }*/

    private String hotelName;
    private int hotelId;
    public void hotelMenu() throws IOException{
        int choice;
        while (true){
            boolean back=false;
            System.out.println("\t\t\t\t1 - item List");
            System.out.println("\t\t\t\t2 - Order Details");
            System.out.println("\t\t\t\t3 - Back");
            System.out.print("Enter The Choice: ");
            choice=Integer.parseInt(reader.readLine());
            switch (choice){
                case 1:
                    itemList();
                    break;
                case 2:

                    break;
                case 3:
                    back = true;
                    break;
            }
            if(back){
                break;
            }
        }
    }

    private void itemList() throws IOException{
        int choice;
        while (true) {
            boolean back=false;
            System.out.println("\t\t\t\t1 - View Items List");
            System.out.println("\t\t\t\t2 - Add Items");
            System.out.println("\t\t\t\t3 - Back");
            System.out.print("Enter The Choice: ");
            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
//                    getHotel();
                    readFile();
                break;
                case 2:
                    addHotels();
                    break;
                case 3:
                    back = true;
                    break;
            }
            if(back){
                break;
            }
        }
    }
    private void addHotels() throws IOException {
        System.out.println("Enter The hotel Name: ");
        hotelName=reader.readLine();
        System.out.println("Enter The hotel Id: ");
        hotelId=Integer.parseInt(reader.readLine());
        System.out.print("Enter The number Of Items: ");
        int j=Integer.parseInt(reader.readLine());
        for(int i=0;i<j;i++){
            addItems();
        }
    }
    private void addItems() throws IOException {
        System.out.print("Enter The Item Name: ");
        String itemName=reader.readLine();
        System.out.print("Enter The price: ");
        int price=Integer.parseInt(reader.readLine());
        System.out.print("Enter The Item Id: ");
        int id=Integer.parseInt(reader.readLine());
        hotels.add(new Hotel(hotelName,hotelId,itemName,price,id));
        writeToFile();
    }
    public void writeToFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\Java\\Application\\Swiggy\\Files\\ItemsList.txt"));
        os.writeObject(hotels);
        os.close();
    }
    public void getHotel(){
        HashMap<Integer,String> hotelslist=new HashMap<Integer,String>();
        try {
            hotels = getObject();
            System.out.println("Hotel ID\tHotel Name");
            for (Hotel itr : hotels) {
                hotelslist.put(itr.gethotelId(),itr.gethotelName());
            }
            for(Map.Entry itr : hotelslist.entrySet()){
                System.out.println(itr.getKey()+" "+itr.getValue());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public void getItemsList(){
        try {
            hotels = getObject();
            System.out.println("Item Name\tPrice\tId");
            for (Hotel itr : hotels) {
                System.out.printf("%-11s%-9d%-10d%-10s%-10d", itr.getItemName(), itr.getPrice(), itr.getItemId(),itr.gethotelName(),itr.gethotelId());
                System.out.println();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFile(){
        try {
            hotels = getObject();
            System.out.println("Item Name\tPrice\tId");
            for (Hotel itr : hotels) {
                System.out.printf("%-11s%-9d%-10d%-10s%-10d", itr.getItemName(), itr.getPrice(), itr.getItemId(),itr.gethotelName(),itr.gethotelId());
                System.out.println();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public LinkedList<Hotel> getObject() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:\\Java\\Application\\Swiggy\\Files\\ItemsList.txt"));
            hotels = (LinkedList<Hotel>) is.readObject();
            is.close();
        }catch (EOFException e){
            System.out.println("\t\t\tNo Item List");
        }
        return hotels;
    }
}
