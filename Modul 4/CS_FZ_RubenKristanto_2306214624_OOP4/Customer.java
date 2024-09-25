public class Customer {
    public String name;
    public String customerID;

    public Customer(String name, String customerID){
        this.name = name;
        this.customerID = customerID;
    }

    public String toString(){
        return "Customer Name: " + this.name + "\nCustomer ID: " + this.customerID;

    }


}
