// The concrete builder class that assembles the parts of the cake object

public class OldCakeBuilder implements CakeBuilder {

    private Cake cake;

    public OldCakeBuilder()
    {
        this.cake= new Cake();
    }


    public void buildCakeMix()
    {
        cake.setCakeMix("Oreo mix! :P");
    }


    public void buildCakeOven()
    {
        cake.setCakeOven("180c");
    }


    public void buildCakeRecipient()
    {
        cake.setCakeRecipient("Oval");
    }


    public void buildCakeToppings()
    {
        cake.setCakeToppings("caramel, strawberry and almonds");
    }

    public Cake getCake() {

        return this.cake;
    }
}