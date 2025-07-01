package GoodCode.ConcreateClasses;

import GoodCode.Beverage;

public class CoffeeBeverage extends Beverage {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Milk and Sugar");
    }
}
