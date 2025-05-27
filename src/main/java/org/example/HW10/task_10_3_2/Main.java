package org.example.HW10.task_10_3_2;


public class Main {
    public static void main(String[] args) {
        Beverage coffee1 = new Sugar(new Sugar(new Espresso()));
        System.out.println(coffee1.description() + " = " + coffee1.cost() + " UAH");

        Beverage coffee2 = new Sugar(new Sugar(new Cream(new DarkRoast())));
        System.out.println(coffee2.description() + " = " + coffee2.cost() + " UAH");

        Beverage coffee3 = new Sugar(new Whip(new DarkRoast()));
        System.out.println(coffee3.description() + " = " + coffee3.cost() + " UAH");

        Beverage coffee4 = new Sugar(new Sugar(new Milk(new Decaf())));
        System.out.println(coffee4.description() + " = " + coffee4.cost() + " UAH");
    }
}
