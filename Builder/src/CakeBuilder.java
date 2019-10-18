// Defines the methods needed for baking tha cake (creating the cake)

public interface CakeBuilder
{

    public void buildCakeMix();

    public void buildCakeOven();

    public void buildCakeRecipient();

    public void buildCakeToppings();

    public Cake getCake();

}