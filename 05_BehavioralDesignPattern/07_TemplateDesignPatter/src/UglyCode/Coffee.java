package UglyCode;

public class Coffee {
    public void prepare() {
        boilWater();
        brewCoffee();
        pourInCup();
        addMilkAndSugar();
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }
    private void brewCoffee() {
        System.out.println("Brewing Coffee");
    }

    private void pourInCup() {
        System.out.println("Pour in the cup");
    }

    private void addMilkAndSugar() {
        System.out.println("Adding Milk and sugar");
    }


}
