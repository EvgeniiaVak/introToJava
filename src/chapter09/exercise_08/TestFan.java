package chapter09.exercise_08;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.switchOn();
        fan1.setSpeed(Fan.FAST);

        System.out.println(fan1);

    }
}
