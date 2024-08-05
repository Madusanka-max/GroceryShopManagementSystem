package groceryshopmanagementsystem;

import java.sql.Date;

public class billData {
    private int customerId;
    private String brandName;
    private String productName;
    private int quantity;
    private Double price;
    private Date date;

    public billData(int customerId, String brandName, String productName, int quantity, double price, Date date) {
        this.customerId = customerId;
        this.brandName = brandName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }
}
