package superMarket;

import java.io.*;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class Admin {
    LinkedList<SuperMarket> superMarket = new LinkedList<>();
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    public void adminMain() throws IOException, ClassNotFoundException {

        while (true){
            boolean back=false;
            System.out.println("\t\t\t\t1 - Add Products");
            System.out.println("\t\t\t\t2 - View Products");
            System.out.println("\t\t\t\t3 - Back");
            System.out.print("Enter The Choice: ");
            int choice=Integer.parseInt(reader.readLine());
            switch (choice){
                case 1:
                    addProducts();
                    writeToFile();
                    System.out.println("\t\t\tSuccess Full Added The Product");
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    back=true;
                    break;
            }
            if(back){
                break;
            }
        }
    }

    public void addProducts() throws IOException {
        System.out.print("Enter The Product Name: ");
        String productName=reader.readLine();
        System.out.print("Enter The product ID: ");
        int id=Integer.parseInt(reader.readLine());
        System.out.print("Enter The priduct Quantity: ");
        int Qty=Integer.parseInt(reader.readLine());
        System.out.print("Enter The product MRP: ");
        int MRP=Integer.parseInt(reader.readLine());
        System.out.print("Enter The product Rate: ");
        int rate=Integer.parseInt(reader.readLine());
        superMarket.add(new SuperMarket(productName,Qty,MRP,rate,id));
    }

    public void writeToFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\Java\\Application\\src\\superMarket\\ProductDetails.txt")));
        os.writeObject(superMarket);
        os.close();
    }


    public void readFile() throws ClassNotFoundException, IOException {
        boolean flag=true;
        try {
            superMarket = getObject();
        }catch (EOFException  e){
            flag=false;
            System.out.println("\t\t\t\tNo Product");
        }
        if(flag) {
            System.out.println("Product Name\tid\tMRP\tRate\tQty");
            for (SuperMarket itr : superMarket) {
                System.out.printf("%-16s%-3d%-4d%-8d%-10d", itr.getProductName(), itr.getId(), itr.getMRP(), itr.getRate(), itr.getQty());
                System.out.println();
            }
        }
    }

    public LinkedList<SuperMarket> getObject() throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:\\Java\\Application\\src\\superMarket\\ProductDetails.txt")));
        superMarket = (LinkedList<SuperMarket>) is.readObject();
        is.close();
        return superMarket;
    }
}
