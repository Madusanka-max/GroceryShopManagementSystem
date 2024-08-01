package groceryshopmanagementsystem;

public class ProductData {
    
    private String ProductId;
    private String ProductName;
    private String BrandName;
    private Double Price;
    private int Status;

    public ProductData(String ProductId,String ProductName,String BrandName,Double Price,int Status){
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.BrandName = BrandName;
        this.Price = Price;
        this.Status = Status;
    }
    public String getProductId(){
        return ProductId;
    }
    public String getProductName(){
        return ProductName;
    }
    public String getBrandName(){
        return BrandName;
    }
    public double getPrice(){
        return Price;
    }
    public int getStatus(){
        return Status;
    }
}
