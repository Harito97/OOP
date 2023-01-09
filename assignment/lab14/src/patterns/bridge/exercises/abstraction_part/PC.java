package patterns.bridge.exercises.abstraction_part;

import patterns.bridge.exercises.implementation_part.OperatingSystem;

public class PC extends Computer{
    public PC(OperatingSystem os) {
        super(os);
    }

    public void startup(){
        super.startup();
        System.out.println("The PC started for you");
    }

    public void browseInternet(String url){
        super.browseInternet(url);
        System.out.println("The website loaded in your PC");
    }

    public boolean canMoveComputer(){
        return false;
    }
}
