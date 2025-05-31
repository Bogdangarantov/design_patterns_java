package org.example.HW21.task21_3_1;

public class BankAccountPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата $" + amount + " з банківського рахунку");
    }
}