package business;

import object.Crust;
import object.Customer;
import object.Pizza;
import object.Topping;
import presentation.DataStub;

public class Access {
    private static DataStub stub;
    public Access() {
        stub = new DataStub();
    }
    public boolean addCustomer(Customer person){
        boolean ans = false;
        if(person!=null){
            ans=stub.insertCustomer(person);
        }
        return ans;
    }
    public boolean updateCustomer(Customer person){
        return stub.updateCustomer(person);
    }
    public boolean addTopping(Topping tp){
        boolean ans = false;
        if(tp!=null){
            ans=stub.insertTopping(tp);
        }
        return ans;
    }
    public void updateToppings(Topping tp){
        stub.updateTopping(tp);
    }
    public boolean addPizza(Pizza plan){
        boolean ans = false;
        if(plan!=null){
            ans=stub.insertPizza(plan);
        }
        return ans;
    }
    public void updatePizza(Pizza plan){
        stub.updatePizza(plan);
    }
    public boolean addCrust(Crust ct){
        boolean ans = false;
        if(ct!=null){
            ans = stub.insertCrust(ct);
        }
       return ans;
    }
    public boolean updateCrust(Crust ct){
        return stub.updateCrust(ct);
    }


}
