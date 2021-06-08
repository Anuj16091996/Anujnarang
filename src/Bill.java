import java.util.Scanner;
import java.util.ArrayList;


public class Bill {
    private static int ids=1;
private int id;
private String Topping_Name;
private Double Topping_price;


    public static int getIds() {
        return ids;
    }

    public String getTopping_Name() {
        return Topping_Name;
    }

    public Double getTopping_price() {
        return Topping_price;
    }

    public Bill(String topping_Name, Double topping_price) {
        this.id=ids++;
        this.Topping_Name = topping_Name;
        this.Topping_price = topping_price;
    }

    public void setTopping_Name(String topping_Name) {
        Topping_Name = topping_Name;
    }

    public void setTopping_price(Double topping_price) {
        Topping_price = topping_price;
    }

    @Override
    public String toString() {
        return String.format("%d %s : $%.2f",this.id, getTopping_Name(), getTopping_price() );
    }
}
