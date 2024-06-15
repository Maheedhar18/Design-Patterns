package command_pattern.command;

import command_pattern.Fan;

public class FanLowCommand implements Command{
    Fan fan;
    int prevSpeed;

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed=fan.getSpeed();
        fan.low();
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
