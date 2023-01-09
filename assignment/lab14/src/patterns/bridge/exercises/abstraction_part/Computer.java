package patterns.bridge.exercises.abstraction_part;

import patterns.bridge.exercises.implementation_part.OperatingSystem;

public abstract class Computer implements ComputerGeneral{
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public void startup(){
        System.out.println("The computer is starting up");
    }

    public void browseInternet(String url){
        System.out.println("Taking information from " + url);
    }

    public abstract boolean canMoveComputer();
}
