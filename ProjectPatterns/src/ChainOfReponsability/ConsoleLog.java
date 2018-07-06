package ChainOfReponsability;

public class ConsoleLog extends AbstractLog {

    public ConsoleLog() {
        this.level = Nivel.INFO.ordinal();
    }
    
    @Override
    protected void write(String content){
        System.out.println("Console: " + content);
    }
    
}
