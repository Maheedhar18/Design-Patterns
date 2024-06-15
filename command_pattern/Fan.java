package command_pattern;

public class Fan {

    int speed=0;

    public void high() {
        speed=2;
        System.out.println("The fan is on high speed");
    }

    public void low() {
        speed=1;
        System.out.println("The fan is on low speed");
    }

    public void off() {
        speed=0;
        System.out.println("The fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
