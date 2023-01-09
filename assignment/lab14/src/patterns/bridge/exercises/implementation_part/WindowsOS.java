package patterns.bridge.exercises.implementation_part;

public class WindowsOS implements OperatingSystem{
    public void startup(){
        System.out.println("The WindowsOS is starting up");
    }

    public void loadUrl(String url){
        System.out.println("The WindowsOS is loading " + url);
    }
}
