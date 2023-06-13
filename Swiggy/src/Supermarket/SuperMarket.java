package Supermarket;

import java.io.Serializable;

public class SuperMarket implements Serializable {
    private String productName;
    private int Qty;
    private int MRP;
    private int rate;
    private int id;

    public SuperMarket(String productName, int qty, int MRP, int rate,int id) {
        this.productName = productName;
        Qty = qty;
        this.MRP = MRP;
        this.rate = rate;
        this.id=id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQty() {
        return Qty;
    }

    public int getMRP() {
        return MRP;
    }

    public int getRate() {
        return rate;
    }
    public int getId() {
        return id;
    }

}
