package Memento;

public class Test {

    public static void main(String[] args) {
        
        Originator org = new Originator();
        CareTaker ctkr = new CareTaker();
        
        org.setValue(100);
        ctkr.add(org.setValueToMemento());
        
        org.setValue(200);
        ctkr.add(org.setValueToMemento());
        
        org.setValue(300);
        ctkr.add(org.setValueToMemento());
        
        org.setValue(400);
        ctkr.add(org.setValueToMemento());
    
        System.out.println("Current value: " + org.getValue());
        for (int i = 3; i >= 0; i--)
            System.out.println("" + i + "-" + "Saved value: " + ctkr.get(i).getValue());
    }
    
}
