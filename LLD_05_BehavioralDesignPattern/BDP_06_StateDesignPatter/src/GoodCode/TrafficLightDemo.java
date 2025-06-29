package BDP_06_StateDesignPatter.src.GoodCode;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        context.next();
        context.next();
        context.next();
    }
}
