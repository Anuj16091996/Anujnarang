public class Basic extends Burger {


    private String Context;

    public Basic()
    {
        super("Basic",3.56, 4 );
        Context ="With White With Chicken" ;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s, :- \n Cost-: $%.2f \n Maximum Topping: %d",this.getId(), this.getType_of_Burger(),
                this.Context,this.getPrice_of_burger(), this.getMax_topping());
    }
}
