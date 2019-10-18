// The chef class creates a cake using the cakebuilder interface.

public class CakeChef
{

    private CakeBuilder cakeBuilder;

    public CakeChef(CakeBuilder cakeBuilder)
    {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake getCake(){

        return this.cakeBuilder.getCake();

    }

    public void makeCake()
    {
        this.cakeBuilder.buildCakeMix();
        this.cakeBuilder.buildCakeOven();
        this.cakeBuilder.buildCakeRecipient();
        this.cakeBuilder.buildCakeToppings();
    }
}