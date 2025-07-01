package GoodCode;

import GoodCode.ConcreateClasses.CoffeeBeverage;
import GoodCode.ConcreateClasses.TeaBeverage;

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
