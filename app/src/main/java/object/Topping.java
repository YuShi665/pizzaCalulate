package object;

public class Topping{
    private String toppingName;
    private int toppingNum;
    private double price;
    public Topping(String topping, int num,double price){
        toppingName = topping;
        toppingNum = num;
        this.price=price;
    }
  public Topping(String topping,double price){
    toppingName = topping;
    toppingNum = 1;
    this.price=price;
}

    public void setToppingNum(int toppingNum) {
        this.toppingNum = toppingNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getToppingName() {
        return toppingName;
    }

    public int getToppingNum() {
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
