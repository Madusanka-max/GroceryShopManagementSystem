package groceryshopmanagementsystem;

public class CashierData {
    private String Password;
    private String Fname;
    private String Lname;
    private String userName;
    private String Gender;


    public CashierData(String Password,String Lname, String Fname ,String userName, String Gender){
        this.Password = Password;
        this.Fname = Fname;
        this.Lname = Lname;
        this.userName = userName;
        this.Gender = Gender;
    }
    public String Password(){
        return Password;
    }
    public String Fname(){
        return Fname;
    }
    public String Lname(){
        return Lname;
    }
    public String userName(){
        return userName;
    }
    public String Gender(){
        return Gender;
    }
}
