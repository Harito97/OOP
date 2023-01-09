package patterns.command.exercises.command_history;

import patterns.command.exercises.command.Command;

import java.util.ArrayList;

public class Switch {
    private ArrayList<Command> history;
    public Switch(){
        history = new ArrayList<>();
    }

    public Switch(ArrayList<Command> history) {
        this.history = history;
    }

    public void storeAndExecute(Command x){
        history.add(x);
        history.get(history.size() - 1).execute();
    }

    public ArrayList<Command> getHistory() {
        return history;
    }
}
