package Supermarket;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Customer {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    LinkedList<Bill> bills=new LinkedList<>();
    ObjectInputStream is;

    private String customerName;
    private String phoneNo;
    private int billId=1;
    private String Date;
    private String Time;
    Admin admin=new Admin();
    public void customerEntry() throws IOException, ClassNotFoundException {
        Date=getDate();
        Time=getTime();
        System.out.println("Enter The Customer Name: ");
        customerName=reader.readLine();
        System.out.println("Enter The Customer Phone No: ");
        phoneNo=reader.readLine();
        while (true) {
            boolean back=false;
            System.out.println("\t\t\t\t1 - View Product");
            System.out.println("\t\t\t\t2 - Buy Product");
            System.out.println("\t\t\t\t3 - View Bill");
            System.out.println("\t\t\t\t4 - Back");
            System.out.print("Enter The Choice: ");
            int choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1:
                    admin.readFile();
                    break;
                case 2:
                    buyProduct();
                    break;
                case 3:
                    viewBill();
                    break;
                case 4:
                    back = true;
                    break;
            }
            if(back){
                break;
            }
        }
    }

    public void buyProduct() throws IOException, ClassNotFoundException {
        LocalDate date = LocalDate.now();
        billId=getBillId();
        System.out.println("Enter The Product ID: ");
        int id = Integer.parseInt(reader.readLine());
        LinkedList<SuperMarket> superMarket = null;
        boolean flag=true;
        try {
            superMarket=admin.getObject();
        }catch (EOFException  e){
            flag=false;
            System.out.println("\t\t\t\tNo Product");
        }
        if(flag) {
            for (SuperMarket itr : superMarket) {
                if (id == itr.getId()) {
                    int quantity = getQuantity();
                    while (quantity > itr.getQty()) {
                        System.out.println("Available Quantity :" + itr.getQty());
                        quantity = getQuantity();
                    }
                    int mrp = itr.getMRP() * quantity;
                    int rate = itr.getRate() * quantity;
                    System.out.printf("%-15s%10d%d", itr.getProductName(), itr.getMRP(), itr.getRate());
//                    bills.clear();
                    bills.add(new Bill(customerName, phoneNo, itr.getProductName(), quantity, mrp, rate, itr.getId(), billId, Date, Time));
                    writeToFile();
                }
                System.out.println();
                System.out.print("1 - Continue Buy\t");
                System.out.println("2 - Payment");
                System.out.print("Enter The Choice: ");
                int choice = Integer.parseInt(reader.readLine());
                if (choice == 1) {
                    System.out.println("Enter The Product ID: ");
                    id = Integer.parseInt(reader.readLine());
                } else if (choice == 2) {
                    getBill();
                    break;
                }
            }
        }
    }
    public int getBillId() throws IOException, ClassNotFoundException {
        int size = 0;
        try {
            bills=getObject();
            size=bills.size();
        }catch (NullPointerException e){
            //System.out.println("\t\tFill is Empty....No Bill....");
        }
        if(size!=0){
            for (Bill itr : bills) {
                billId=itr.getBillId()+1;
            }
        }
        return billId;
    }

    public int getQuantity() throws IOException {
        System.out.print("Enter The No Of quantity: ");
        return Integer.parseInt(reader.readLine());
    }

    public void getBill(){
        System.out.println("\t\t\t\tInvoice");
        System.out.println("\tBill ID : "+billId);
        System.out.println("\tDate: "+Date+"\t"+"Time: "+Time);
        int ratetotal=0,mrptotal=0;
        System.out.printf("\tNAME: %-15sPHONE NO: %-10s",customerName,phoneNo);
        System.out.println();
        System.out.println();
        System.out.println("\t  Product Name\tMRP  \tRate");
        for(Bill itr:bills){
            if(billId==itr.getBillId()) {
                ratetotal += itr.getRate();
                mrptotal += itr.getMRP();
                System.out.printf("\t  %-10s%10d   %-10d", itr.getProductName(), itr.getMRP(), itr.getRate());
                System.out.println();
            }
        }
        System.out.println();
        System.out.printf("\tSaved: %-10d Total: %-10d",mrptotal-ratetotal,ratetotal);
        System.out.println();
        System.out.println("\n");
        bills.clear();
    }


    public void readFile() throws ClassNotFoundException, IOException {
        int size = 0;
        try {
            bills=getObject();
            size=bills.size();
        }catch (NullPointerException e){
            System.out.println("\t\tFill is Empty....No Bill....");
        }
        if(size!=0) {
            for(Bill itr:bills){
                if(billId==itr.getBillId()){
                    customerName= itr.getCustomerName();
                    phoneNo= itr.getPhoneNo();
                    Date=itr.getDate();
                    Time=itr.getTime();
                    getBill();
                }
            }

        }
    }

    public String getDate(){
        LocalDate date = LocalDate.now();
        return date.getDayOfMonth()+"-"+date.getMonth()+"-"+date.getYear();
    }

    public String getTime(){
        LocalTime time = LocalTime.now();
        return time.getHour()+":"+time.getMinute();
    }

    public void viewBill() throws IOException, ClassNotFoundException {
        System.out.print("Enter The Bill No: ");
        billId=Integer.parseInt(reader.readLine());
        readFile();
    }

    public void writeToFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\Java\\Application\\src\\superMarket\\Bill.txt"));
        os.writeObject(bills);
        os.close();
    }

    public LinkedList<Bill> getObject() throws IOException, ClassNotFoundException {
        try {
            is= new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:\\Java\\Application\\src\\superMarket\\Bill.txt")));
            bills = (LinkedList<Bill>) is.readObject();
            is.close();
            return bills;
        }catch (EOFException e){
//            System.out.println("\t\tFill is Empty....No Bill....");
        }
        return null;
    }

}
