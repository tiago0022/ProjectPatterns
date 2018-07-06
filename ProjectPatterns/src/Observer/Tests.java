package Observer;

public class Tests {

    public static void main(String[] args) {
        Subject s = new Subject();
        s.attach(new BinaryObserver(s));
        s.attach(new OctalObserver(s));
        s.attach(new HexaObserver(s));
        
        System.out.println("First value = 15");
        s.setState(15);
        
        System.out.println("First value = 10");
        s.setState(10);
    }
    
}
