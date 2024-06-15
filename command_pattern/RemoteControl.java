package command_pattern;

import command_pattern.command.Command;

import java.util.Stack;

public class RemoteControl {
    Command[] commands;
    Stack<Command> undoCommands;

    public RemoteControl() {
        commands=new Command[7];
        commands=new Command[7];
        undoCommands=new Stack<Command>();
    }

    public void setOnCommands(int index, Command command) {
        commands[index]=command;
    }

    public void commandButtonIsPushed(int index) {
        commands[index].execute();
        undoCommands.push(commands[index]);
    }

    public void undoButtonIsPushed() {
        if(undoCommands.isEmpty()){
            System.out.println("The commands are all reset");
            return;
        }
        undoCommands.pop().undo();
    }

    public String toString() {
        StringBuffer string =new StringBuffer();
        for(int i=0;i<7;i++ ) {
            string.append(i+" - "+commands[i].getClass().getName()+"\n");
        }
        return string.toString();
    }
}
