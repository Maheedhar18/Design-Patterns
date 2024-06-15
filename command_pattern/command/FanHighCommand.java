package command_pattern.command;

import command_pattern.Fan;

public class FanHighCommand implements Command{
    Fan fan;
    int prevSpeed;

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed=fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed==0) {
            fan.off();
        } else if (prevSpeed==1) {
            fan.low();
        } else if (prevSpeed==2) {
            fan.high();
        }
    }
}
