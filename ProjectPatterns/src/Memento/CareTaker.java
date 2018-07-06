package Memento;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> mementoList = new ArrayList<Memento>();
    
    public void add(Memento m){
        this.mementoList.add(m);
    }
    
    public Memento get(int idx){
        return this.mementoList.get(idx);
    }
}
