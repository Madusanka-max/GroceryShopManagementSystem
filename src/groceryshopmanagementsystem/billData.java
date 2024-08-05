package groceryshopmanagementsystem;

import java.sql.Date;

public class billData {
    private int customerId;
    private String brandName;
    private String productName;
    private int quantity;
    private Double price;
    private Date date;

    
    public billData(int customerId,String brandName,String productName,int quantity,double price,Date date){
        this.customerId = customerId;
        this.brandName = brandName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }
    public int getcustomerId(){
        return customerId;
    }
    public String getbrandName(){
        return brandName;
    }
    public String getproductName(){
        return productName;
    }
    public int getquantity(){
        return quantity;
    }
    public double getprice(){
        return price;
    }
    public Date getdate(){
        return date;
    }

}
