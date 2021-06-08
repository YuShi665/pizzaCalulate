package object;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.security.Key;

import business.CalculateCost;
@RequiresApi(api = Build.VERSION_CODES.N)
public class Order {
//    private String customerID;
//    private String customerAddress;
//    private String customerName;
    private Customer person;
    private Pizza plan;
    private String cost;


    public Order(Customer person, Pizza plan) {
        this.person = person;
        this.plan = plan;
        cost = summary(plan);
    }

    public String summary(Pizza key){
        String ans = "?";
        if(key!=null)
        {
            ans = CalculateCost.cost(key);
        }
        return ans;
    }

}
