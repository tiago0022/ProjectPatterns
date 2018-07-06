package ChainOfReponsability;

public class ErrorLog extends AbstractLog {

    public ErrorLog() {
        this.level = Nivel.ERROR.ordinal();
    }
    
    @Override
    protected void write(String content){
        System.out.println("Error: " + content);
    }
    
}
