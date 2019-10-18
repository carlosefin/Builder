// based on BakeryProcedure interface

public class Cake implements BakeryProcedure
{

    private String cakeMix;
    private String cakeOven;
    private String cakeRecipient;
    private String cakeToppings;

    public void setCakeMix(String mix)
    {
        cakeMix = mix;
    }

    public String getCakeMix(){return cakeMix;}

    public void setCakeOven(String oven)
    {
        cakeOven = oven;
    }

    public String getCakeOven(){return cakeOven;}

    public void setCakeRecipient(String recipient)
    {
        cakeRecipient = recipient;
    }

    public String getCakeRecipient(){return cakeRecipient;}

    public void setCakeToppings(String toppings)
    {
        cakeToppings = toppings;
    }

    public String getCakeToppings(){return cakeToppings;}

}