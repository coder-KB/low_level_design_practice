package TemplateDesignPatter.src.GoodCode;

abstract public class Beverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pour in the cup");
    }

    abstract public void brew();
    abstract public void addCondiments();
}
