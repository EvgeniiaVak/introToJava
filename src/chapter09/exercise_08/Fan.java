package chapter09.exercise_08;

public class Fan {
    public final static int SLOW = 1,
                            MEDIUM = 2,
                            FAST = 3;

    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    @Override
    public String toString() {
        String speed;

        switch (this.speed) {
            case SLOW:
                speed = "slow";
                break;
            case MEDIUM:
                speed = "medium";
                break;
            case FAST:
                speed = "fast";
                break;
            default:
                speed = "no such speed";
        }

        if (isOn)
            return String.format("speed: %s, color: %s, and radius: %f", speed, color, radius);
        else
            return String.format("color: %s, radius: %f, fan is off", color, radius);
    }

    public int getSpeed() {
        if (isOn)
            return speed;
        else
            return 0;
    }

    public void setSpeed(int speed) {
        if (isOn && speed >= 1 && speed <= 3)
            this.speed = speed;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 1 && radius <= 20)
            this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
