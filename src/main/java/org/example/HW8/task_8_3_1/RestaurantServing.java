package org.example.HW8.task_8_3_1;

public class RestaurantServing implements ServingStyle {
    @Override
    public void serve(String beverageName) {
        System.out.println("Serving " + beverageName + " in a ceramic cup at the restaurant.");
    }
}
