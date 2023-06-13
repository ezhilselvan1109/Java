package superMarket;

import java.io.Serializable;

public class Bill implements Serializable {
    private String customerName;
    private String phoneNo;
    private String productName;
    private int Qty;
    private int MRP;
    private int rate;
    private int productId;
    private int billId;

    private String Date;
    private String Time;
    public Bill(String customerName, String phoneNo, String productName, int qty, int MRP, int rate, int productId, int billId, String date, String time) {
        this.customerName = customerName;
        this.phoneNo = phoneNo;
        this.productName = productName;
        Qty = qty;
        this.MRP = MRP;
        this.rate = rate;
        this.productId = productId;
        this.billId = billId;
        Date = date;
        Time = time;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNo() {
        return phoneNo;
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

    public int getProductId() {
        return productId;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public int getBillId() {
        return billId;
    }
}
