package BDP_07_TemplateDesignPatter.src.GoodCode.ConcreateClasses;

import BDP_07_TemplateDesignPatter.src.GoodCode.Beverage;

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
