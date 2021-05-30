package business;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import object.Topping;

public class CalculateCost {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String cost(List<Topping> elements, String size) {
        final String[] PizzaSize = {"extraLarge", "Large", "Medium", "Small"};
        final double[] pizzaPrice = {10.0, 8.0, 6.0, 4.0};
        final String[] ToppingList = {"T1", "T2", "T3", "T4"};
        final double[] ToppingPrice = {10.0, 8.0, 6.0, 4.0};
        Topping element;
        double totalCost;
        double toppingCost;
        boolean found;
        int count;
        int missTopping;
        int validTopping;
        String money;


        missTopping=0;
        validTopping=0;
        count=0;
        found=false;
        totalCost=0.0;
        money="";

        if(size!=null && !found){
            for(Iterator<String> it = Arrays.stream(PizzaSize).iterator(); it.hasNext();){
                count++;
                String s = it.next();
                if(s.compareToIgnoreCase(size)==0){
                    found = true;
                    // System.out.println( pizzaPrice[count-1]);
                    totalCost+=pizzaPrice[count-1];
                    money = ""+totalCost;
                }
            }
            if(!found){
                money = "??";
               // System.out.println("size");
            }
        }


        if((elements!=null) && (elements.size())>0 && found){

            for(Iterator<Topping> it = elements.iterator();it.hasNext();){
                element = it.next();
                if(!(element instanceof Topping)){
                    missTopping=0;
                    validTopping=0;
                    money="?";
                    break;
                }else {
                    toppingCost=element.getToppingPrice();
                   // System.out.println(toppingCost);
                    if(toppingCost<=0){
                        missTopping++;
                    }else{
                        count=0;
                        //System.out.println(count);
                        found=false;
                        for(Iterator<String> topping = Arrays.stream(ToppingList).iterator(); topping.hasNext();){
                            count++;
                            String find = topping.next();
                            if(element.getToppingName().compareToIgnoreCase(find)==0){
                                //System.out.println(count);
                                totalCost+=ToppingPrice[count-1];
                                validTopping++;
                                found=true;
                               // System.out.println(ToppingPrice[count-1]);
                            }
                        }
                        if(!found){
                            missTopping++;
                        }
                    }

                }
                //System.out.println(missTopping);
            }
        }
        if(elements!=null&&((validTopping+missTopping)==elements.size())&&validTopping>0){
            money = ""+totalCost;
        }
        return money;
    }
}
