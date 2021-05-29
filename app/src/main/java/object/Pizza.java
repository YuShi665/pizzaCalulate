package object;

import java.util.List;

public class Pizza {
    private List<Topping> toppingList;
    private String pizzaSize;
    private String crust;

    public Pizza(String size){
        pizzaSize = size;
        toppingList = null;
    }
    public Pizza(List<Topping> toppings, String size, String type){
        pizzaSize = size;
        toppingList = toppings;
        crust = type;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }
}
