package org.example.HW21.task21_3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setPaymentStrategy(new BankAccountPayment());
        customer.makePayment(150);

        customer.setPaymentStrategy(new PayPalPayment());
        customer.makePayment(200);
    }
}