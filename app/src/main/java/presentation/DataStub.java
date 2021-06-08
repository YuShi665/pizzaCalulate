package presentation;

import java.util.ArrayList;

import object.Crust;
import object.Customer;
import object.Pizza;
import object.Topping;

public class DataStub {
    //private String DbName;
    private ArrayList<Customer> customerList;
    private ArrayList<Topping> ToppingList;
    private ArrayList<Pizza> pizzaList;
    private ArrayList<Crust> crustList;

//    public DataStub(String DB) {
//        DbName = DB;
//        create();
//    }
    public DataStub(){
        create();
    }

    private void create(){
        customerList = new ArrayList<Customer>();
        Customer person;
        person = new Customer("000","location1","Samuel Ironkew");
        customerList.add(person);
        person = new Customer("0001","location2","Junwei Wang");
        customerList.add(person);
        person = new Customer("0002","location3","Jasmin Dhaliwal");
        customerList.add(person);
        person = new Customer("0003","location3","Apurv Bhandari");
        customerList.add(person);
        person = new Customer("0004","location4","Yu Shi");
        customerList.add(person);

        Topping tp;
        ToppingList = new ArrayList<Topping>();
        tp = new Topping("Topping1",1);
        ToppingList.add(tp);
        tp = new Topping("Topping2",2);
        ToppingList.add(tp);
        tp = new Topping("Topping3",3);
        ToppingList.add(tp);
        tp = new Topping("Topping4",4);
        ToppingList.add(tp);
        tp = new Topping("Topping5",5);
        ToppingList.add(tp);

        pizzaList = new ArrayList<Pizza>();
        Crust ct;
        crustList = new ArrayList<Crust>();
        ct= new Crust("C1",1);
        crustList.add(ct);
        ct= new Crust("C2",1);
        crustList.add(ct);
        ct= new Crust("C3",1);
        crustList.add(ct);

        System.out.println("Opened  database success ");
    }

//    public String getDbName() {
//        return DbName;
//    }

    public ArrayList<Customer> getCustomers() {
        return customerList;
    }

    public ArrayList<Topping> getToppings() {
        return ToppingList;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzaList;
    }

//    public ArrayList<Order> getPlans() {
//        return plans;
//    }

    public boolean insertTopping(Topping tp){
       return ToppingList.add(tp);
    }
//    public boolean updateTopping(Topping tp){
//        int index = Toppings.indexOf(tp);
//        boolean vaild= false;
//        if(index>=0&& (Toppings.get(index).getPrice()!=tp.getPrice()||Toppings.get(index).getToppingNum()!= tp.getToppingNum())){
//            Toppings.set(index,tp);
//        }
//    }

    public boolean insertCustomer(Customer person){
        return customerList.add(person);
    }
    public boolean updateCustomer(Customer person){
        int index = customerList.indexOf(person);
        boolean ans = false;
        if(index>=0){
            customerList.set(index,person);
            ans=true;
        }
        return ans;
    }

    public boolean insertPizza(Pizza pz){
        return pizzaList.add(pz);
    }
    public void updatePizza(Pizza pz){
        int index = pizzaList.indexOf(pz);
        if(index>=0){
            pizzaList.set(index,pz);
        }
    }

//    public boolean insertOrder(Order plan){
//        return plans.add(plan);
//    }
    public void updateTopping(Topping tp){
        int index = ToppingList.indexOf(tp);
        if(index>=0){
            ToppingList.set(index,tp);
        }
    }
    public boolean updateCrust(Crust ct){
        boolean ans = false;
        int index = crustList.indexOf(ct);
        if(index>=0){
            crustList.set(index,ct);
            ans=true;
        }
        return ans;

    }
    public boolean insertCrust(Crust ct){
        return crustList.add(ct);
    }


}
