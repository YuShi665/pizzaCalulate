package object;

public class Topping {
    private String toppingName;
    private double toppingPrice;
    public Topping(String topping, double price){
        toppingName = topping;
        toppingPrice = price;
    }

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }
    public boolean equals(Object object)
    {
        boolean result;
        Topping s;

        result = false;

        if (object instanceof Topping)
        {
            s = (Topping) object;
            if (((s.toppingName == null) && (toppingName == null)) || (s.toppingName.equals(toppingName)))
            {
                result = true;
            }
        }
        return result;
    }

}
