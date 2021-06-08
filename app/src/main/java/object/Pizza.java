package object;

import java.util.List;

public class Pizza {
    private String ID;
    private List<Topping> toppingList;
    private String pizzaSize;
    private Crust crust;

    public Pizza(String ID){
        this.ID=ID;
        pizzaSize = "";
        toppingList = null;
        crust=null;
    }
    public Pizza(String id,List<Topping> toppings, String size, Crust type){
        ID=id;
        pizzaSize = size;
        toppingList = toppings;
        crust = type;
    }
//
//    //public void setCrust(String crust) {
//        this.crust = crust;
//    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public Crust getCrust() {
        return crust;
    }

    public String getID() {
        return ID;
    }
    public boolean equals(Object object)
    {
        boolean result;
        Pizza key;

        result = false;

        if (object instanceof Pizza)
        {
            key = (Pizza) object;
            if (((key.ID == null) && (ID == null)) || (key.ID.equals(ID)))
            {
                result = true;
            }
        }
        return result;
    }
}
