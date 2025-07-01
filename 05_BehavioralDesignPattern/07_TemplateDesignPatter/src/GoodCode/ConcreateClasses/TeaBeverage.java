package GoodCode.ConcreateClasses;

import GoodCode.Beverage;

public class TeaBeverage extends Beverage {
    @Override
    public void brew() {
        System.out.println("Steeping tea bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
