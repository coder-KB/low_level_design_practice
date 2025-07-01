package UglyCode;

public class TraditionalBeveragesDemo {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Preparing Coffee");
        coffee.prepare();

        Tea tea = new Tea();
        System.out.println("Preparing Tea");
        tea.prepare();
    }
}
