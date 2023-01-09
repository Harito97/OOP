package patterns.command.exercises;

import patterns.command.exercises.command.Command;
import patterns.command.exercises.command_history.Switch;
import patterns.command.exercises.editor.Computer;
import patterns.command.exercises.functions.RestartCommand;
import patterns.command.exercises.functions.ShutDownCommand;

public class TestCommand {
    Command command;
    public TestCommand(Command command){
        this.command = command;
    }

    public static void main(String[] args) {
        Computer x = new Computer();
        Command command1 = new RestartCommand(x);
        Command command2 = new ShutDownCommand(x);
        Switch history = new Switch();
        history.storeAndExecute(command1);
        history.storeAndExecute(command2);
        //Thuc hien hoan tac (undo)
        System.out.println("Thuc hien hoan tac");
        history.getHistory().get(history.getHistory().size() - 2).execute();
    }
}
