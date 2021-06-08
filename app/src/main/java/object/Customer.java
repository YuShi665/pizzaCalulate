package object;

public class Customer {
    private String customerID;
    private String customerName;
    private String customerAddress;
    //private String password;

    public Customer(String ID){
        customerID = ID;
        customerAddress=null;
        customerName=null;
       // password=null;
    }
    public Customer(String ID, String address, String name){
        customerName = name;
        customerAddress = address;
        customerID = ID;
       // password=null;
    }



    public String getCustomerID(){
        return customerID;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerAddress(){
        return customerAddress;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String toString(){
        return "Customer: " + customerName+" Customer ID: "+ customerID+" Customer address: "+customerAddress;
    }
    public boolean equals(Object object)
    {
        boolean result;
        Customer s;

        result = false;

        if (object instanceof Customer)
        {
            s = (Customer) object;
            if (((s.customerID == null) && (customerID == null)) || (s.customerID.equals(customerID)))
            {
                result = true;
            }
        }
        return result;
    }



}
