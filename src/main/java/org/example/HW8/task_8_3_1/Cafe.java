import org.example.HW8.task_8_3_1.*;

public class Cafe {
    public static void main(String[] args) {
        Beverage blackCoffee = new Coffee(new RestaurantServing());
        blackCoffee.prepare();
        blackCoffee.serve();
        System.out.println("Price: " + blackCoffee.cost() + " UAH");

        Beverage coffeeToGo = new CoffeeWithMilk(new TakeAwayServing());
        coffeeToGo.prepare();
        coffeeToGo.serve();
        System.out.println("Price: " + coffeeToGo.cost() + " UAH");

        Beverage tee = new Tee(new RestaurantServing());
        tee.prepare();
        tee.serve();
        System.out.println("Price: " + tee.cost() + " UAH");

        Beverage teeWithMilkToGo = new TeeWithMilk(new TakeAwayServing());
        teeWithMilkToGo.prepare();
        teeWithMilkToGo.serve();
        System.out.println("Price: " + teeWithMilkToGo.cost() + " UAH");

        Beverage chocolate = new Chocolate(new RestaurantServing());
        chocolate.prepare();
        chocolate.serve();
        System.out.println("Price: " + chocolate.cost() + " UAH");

        Beverage milkChocoToGo = new MilkChocolate(new TakeAwayServing());
        milkChocoToGo.prepare();
        milkChocoToGo.serve();
        System.out.println("Price: " + milkChocoToGo.cost() + " UAH");
    }
}
