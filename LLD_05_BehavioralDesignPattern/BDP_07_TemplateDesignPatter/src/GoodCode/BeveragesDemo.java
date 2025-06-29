package BDP_07_TemplateDesignPatter.src.GoodCode;

import BDP_07_TemplateDesignPatter.src.GoodCode.ConcreateClasses.CoffeeBeverage;
import BDP_07_TemplateDesignPatter.src.GoodCode.ConcreateClasses.TeaBeverage;

public class BeveragesDemo {
    public static void main(String[] args) {
        Beverage coffee = new CoffeeBeverage();
        System.out.println("Preparing Coffee");
        coffee.prepareRecipe();

        Beverage tea = new TeaBeverage();
        System.out.println("Preparing Tea");
        tea.prepareRecipe();
    }
}
