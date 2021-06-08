public class Healthy extends Burger {

    private String Context;

    public Healthy()
    {
        super("Healthy",5.678798798789, 6);
        this.Context = "With Brown Rye With Bacon";
    }

    @Override
    public String toString() {
        return String.format("%d %s %s, :- \n Cost-: $%.2f \n Maximum Topping: %d",this.getId(),this.getType_of_Burger(),
                this.Context,this.getPrice_of_burger(), this.getMax_topping());
    }

}
