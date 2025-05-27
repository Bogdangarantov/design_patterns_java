package org.example.HW9;

public class ExpensesClient {
    public static void main(String[] args) {
        Manager generalManager = new Manager("General Manager");

        SalesTeam meatDept = new SalesTeam();
        meatDept.addMember(new Manager("Meat Manager"));
        meatDept.addMember(new Salesperson("Butcher A"));
        meatDept.addMember(new Salesperson("Butcher B"));
        meatDept.addMember(new Salesperson("Butcher C"));

        SalesTeam dairyDept = new SalesTeam();
        dairyDept.addMember(new Manager("Dairy Manager"));
        dairyDept.addMember(new Salesperson("Dairy A"));
        dairyDept.addMember(new Salesperson("Dairy B"));
        dairyDept.addMember(new Salesperson("Dairy C"));

        SalesTeam sweetsDept = new SalesTeam();
        sweetsDept.addMember(new Manager("Sweets Manager"));
        sweetsDept.addMember(new Salesperson("Candy A"));
        sweetsDept.addMember(new Salesperson("Candy B"));
        sweetsDept.addMember(new Salesperson("Candy C"));

        SalesTeam fullStore = new SalesTeam();
        fullStore.addMember(generalManager);
        fullStore.addMember(meatDept);
        fullStore.addMember(dairyDept);
        fullStore.addMember(sweetsDept);

        System.out.println("Paying All Store Expenses ");
        fullStore.payExpenses();
    }
}
