package obsever_pattern.example;

import java.util.List;

public class Subject {
    private List<Obsever> obsevers;
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attcach(){
        for (int i = 0; i < obsevers.size(); i++){
            obsevers.get(i).update();
            //if (obsevers.get(i).subject == )
        }
    }
}
