package business;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import object.Pizza;
import object.Topping;

public class CalculateCost {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String cost(Pizza pizza) {


        Topping element;
        double totalCost = 0.0;
        double toppingCost = 0;
      //  double pizzaSizeCost;

        int toppingNum = 0;
        int missTopping = 0;
        int validTopping = 0;
        String money = "";
        double crustCost = pizza.getCrust().getPrice();

        if (pizza.getToppingList() != null) {
            for (Iterator<Topping> it = pizza.getToppingList().iterator(); it.hasNext(); ) {
                element = it.next();
                if (!(element instanceof Topping)) {
                    missTopping = 0;
                    validTopping = 0;
                    money = "wrong input ";
                    break;
                }
                toppingNum = element.getToppingNum();
                // System.out.println(toppingCost);
                if (toppingNum <= 0) {
                    missTopping += toppingNum;
                } else {
                    toppingCost += element.getPrice() * 1.13 * toppingNum;
                    validTopping++;
                }
            }
        }

        if (pizza.getToppingList() != null && ((validTopping + missTopping) == pizza.getToppingList().size()) && (validTopping > 0) && money == "") {
            totalCost = toppingCost + crustCost;
            money = "" + totalCost;
        }

        return money;
    }
}





