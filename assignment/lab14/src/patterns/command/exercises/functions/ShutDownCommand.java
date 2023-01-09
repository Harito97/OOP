package patterns.command.exercises.functions;

import patterns.command.exercises.*;
import patterns.command.exercises.command.Command;
import patterns.command.exercises.editor.Computer;

public class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.shutDown();
    }
}
