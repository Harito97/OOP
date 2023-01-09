package patterns.bridge.exercises;

import patterns.bridge.exercises.abstraction_part.Computer;
import patterns.bridge.exercises.abstraction_part.ComputerGeneral;
import patterns.bridge.exercises.abstraction_part.Laptop;
import patterns.bridge.exercises.abstraction_part.PC;
import patterns.bridge.exercises.implementation_part.MacOS;
import patterns.bridge.exercises.implementation_part.OperatingSystem;
import patterns.bridge.exercises.implementation_part.WindowsOS;

public class Client {
    public static void main(String[] args) {
        testComputer(new MacOS());
        System.out.println();
        testComputer(new WindowsOS());
    }

    public static void testComputer(OperatingSystem os) {
        System.out.println("Tests with advanced function of a laptop.");
        ComputerGeneral laptop = new Laptop(os);
        laptop.startup();
        laptop.browseInternet("https:\\\\google.com");

        System.out.println("\nTests with advanced function of a PC.");
        ComputerGeneral pc = new PC(os);
        pc.startup();
        pc.browseInternet("https:\\\\google.com");
    }
}
