package UglyCode;

public class TrafficLight {
    private String color;

    public TrafficLight() {
        this.color = "RED"; // will start with red
    }

    public void next() {
        if(color.equals("RED")) {
            color = "GREEN";
            System.out.println("Light Changed from RED to GREEN, Cars go");
        } else if(color.equals("GREEN")) {
            color = "YELLOW";
            System.out.println("Light Changed from GREEN to YELLOW, Cars slow down");
        }else if(color.equals("YELLOW")) {
            color = "RED";
            System.out.println("Light Changed from YELLOW to RED, Cars stop");
        }
    }

    public String getColor() {
        return color;
    }
}
