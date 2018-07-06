package Memento;

public class Originator {
    
    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    public void getValueFromMemento(Memento memento){
        System.out.println("Saved value: " + memento.getValue());
    }
    
    public Memento setValueToMemento(){
        return new Memento(this.value);
    }
    
}
