package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public Subject() {
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach (Observer obs){
        this.observers.add(obs);
    }
    
    public void notifyAllObservers(){
        if(!this.observers.isEmpty())
            for(Observer obs : this.observers){
                obs.update();
            }
    }
}
