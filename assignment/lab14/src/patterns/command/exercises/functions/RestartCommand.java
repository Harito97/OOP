package patterns.command.exercises.functions;

import patterns.command.exercises.command.Command;
import patterns.command.exercises.editor.Computer;

public class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute(){
        computer.restart();
    }
}
