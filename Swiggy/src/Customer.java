import java.io.*;

@SuppressWarnings("unchecked")
public class Customer implements Serializable{
    public Customer(String name,String phoneNo, String address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    private String name;

    private String phoneNo;
    private String address;

    public String getName() {
        return name;
    }



    public String getPhNo() {
        return phoneNo;
    }



    public String getAddress() {
        return address;
    }




}
