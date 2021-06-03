package object;

public class Topping {
    private String toppingName;
    private int toppingNum;
    public Topping(String topping, int price){
        toppingName = topping;
        toppingNum = price;
    }
public Topping(String topping){
    toppingName = topping;
    toppingNum = 1;
}


    public String getToppingName() {
        return toppingName;
    }

    public double getToppingNum() {
        return toppingNum;
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
