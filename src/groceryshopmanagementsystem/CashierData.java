package groceryshopmanagementsystem;

public class CashierData {
    private String Password;
    private String Fname;
    private String Lname;
    private String userName;
    private String Gender;


    public CashierData(String userName,String Password,String Lname, String Fname ,String Gender){
        this.Password = Password;
        this.Fname = Fname;
        this.Lname = Lname;
        this.userName = userName;
        this.Gender = Gender;
    }
    public String getPassword() {
        return Password;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getUserName() {
        return userName;
    }

    public String getGender() {
        return Gender;
    }
}
