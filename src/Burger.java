import java.util.ArrayList;


public class Burger {

 private int id;
 private static int ids=1;
private String Type_of_Burger;
private Double price_of_burger;
private Integer max_topping;

    public int getId() {
        return id;
    }

    public Burger(String type_of_Burger, double price_of_burger, int max_topping)
    {
        this.id=ids++;
        this.Type_of_Burger = type_of_Burger;
        this.price_of_burger = price_of_burger;
        this.max_topping = max_topping;
    }

    public String getType_of_Burger() {
        return Type_of_Burger;
    }

    public Double getPrice_of_burger() {
        return price_of_burger;
    }

    public Integer getMax_topping() {
        return max_topping;
    }
}
