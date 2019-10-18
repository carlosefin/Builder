public class TestCakeBuilder
{
    public static void main(String[] args)
    {
        //gets cakebuilder
        CakeBuilder oldCake = new OldCakeBuilder();
        //pass the previous cake specs to the chef
        CakeChef cakeChef = new CakeChef(oldCake);
        //tell the chef to make the cake with the specs of OldCakeB
        cakeChef.makeCake();

        //chef returns cake cooked based on the specs of line 8
        Cake firstCake = cakeChef.getCake();

        System.out.println("Cake Cooked");
        System.out.println("Cake Mix Type: " + firstCake.getCakeMix());
        System.out.println("Cake Oven Temperature: " + firstCake.getCakeOven());
        System.out.println("Cake Recipient Shape: " + firstCake.getCakeRecipient());
        System.out.println("Cake Toppings : " + firstCake.getCakeToppings());
    }
}