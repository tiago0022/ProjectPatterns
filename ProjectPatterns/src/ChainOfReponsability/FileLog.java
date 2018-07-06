package ChainOfReponsability;

public class FileLog extends AbstractLog {

    public FileLog() {
        this.level = Nivel.DEBUG.ordinal();
    }
    
    @Override
    protected void write(String content){
        System.out.println("File: " + content);
    }
    
}
