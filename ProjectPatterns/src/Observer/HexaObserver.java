package Observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void update(){
        System.out.println("Hexa: " + Integer.toHexString(this.subject.getState()));
    }
    
}
