package BDP_07_TemplateDesignPatter.src.UglyCode;

public class Tea {
    public void prepare() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }
    private void steepTeaBag() {
        System.out.println("Steep Tea Bag");
    }

    private void pourInCup() {
        System.out.println("Pour in the cup");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }


}
