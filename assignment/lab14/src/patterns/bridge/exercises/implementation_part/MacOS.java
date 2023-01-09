package patterns.bridge.exercises.implementation_part;

public class MacOS implements OperatingSystem{
    public void startup(){
        System.out.println("The MacOS is starting up");
    }

    public void loadUrl(String url){
        System.out.println("The MacOS is loading " + url);
    }
}
