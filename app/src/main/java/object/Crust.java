package object;

public class Crust {
    private String type;
    private double price;

    public Crust(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    public boolean equals(Object object)
    {
        boolean result;
        Crust key;

        result = false;

        if (object instanceof Crust)
        {
            key = (Crust) object;
            if (((key.type == null) && (type == null)) || (key.type.equals(type)))
            {
                result = true;
            }
        }
        return result;
    }
}
