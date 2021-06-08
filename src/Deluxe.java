public class Deluxe extends Burger {
    private String Context;

    public Deluxe()
    {
        super("Deluxe", 14.54, 2);
        this.Context="With White with Sausage";

    }

    @Override
    public String toString() {
        return String.format("%d %s %s, :- \n Cost-: $%.2f \n Maximum Topping: %d",this.getId(), this.getType_of_Burger(),
                this.Context,this.getPrice_of_burger(), this.getMax_topping());
    }
}
