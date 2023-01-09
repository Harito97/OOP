package patterns.bridge.exercises.abstraction_part;

import patterns.bridge.exercises.implementation_part.OperatingSystem;

public class Laptop extends Computer{
    public Laptop(OperatingSystem os) {
        super(os);
    }

    public void startup(){
        super.startup();
        System.out.println("The laptop started for you");
    }

    public void browseInternet(String url){
        super.browseInternet(url);
        System.out.println("The website loaded in your laptop");
    }

    public boolean canMoveComputer(){
        return true;
    }
}
