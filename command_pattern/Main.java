package command_pattern;

import command_pattern.command.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        Fan fan=new Fan();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);
        FanOffCommand fanOffCommand=new FanOffCommand(fan);
        FanLowCommand fanLowCommand=new FanLowCommand(fan);
        FanHighCommand fanHighCommand=new FanHighCommand(fan);
        Command[] turnAllOn={lightOnCommand, fanHighCommand};
        Command[] turnAllOff={lightOffCommand, fanOffCommand};
        MacroCommand commandToTurnAllOn=new MacroCommand(turnAllOn);
        MacroCommand commandToTurnAllOff=new MacroCommand(turnAllOff);

        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setOnCommands(0, lightOnCommand);
        remoteControl.setOnCommands(1, lightOffCommand);
        remoteControl.setOnCommands(2, fanHighCommand);
        remoteControl.setOnCommands(3, fanLowCommand);
        remoteControl.setOnCommands(4, fanOffCommand);
        remoteControl.setOnCommands(5, commandToTurnAllOn);
        remoteControl.setOnCommands(6, commandToTurnAllOff);
        System.out.println(remoteControl);
        System.out.println("Press 8 to undo");
        System.out.println("Press 9 to exit");

        Scanner scanner=new Scanner(System.in);
        while(true) {
            int value=scanner.nextInt();
            if(value==9) break;
            if(value==8) remoteControl.undoButtonIsPushed();
            else remoteControl.commandButtonIsPushed(value);
        }

    }
}
