package ChainOfReponsability;

public abstract class AbstractLog {
    
    protected int level;
    protected AbstractLog nextLog = null;

    public void setNextLog(AbstractLog nextLog) {
        this.nextLog = nextLog;
    }
    
    public void logMessage(int level, String content){
        if(level == this.level)
            this.write(content);
        else{
            System.out.println("Calling level = " + this.level + ", Execute level = " + level);
            if(this.nextLog != null)
                this.nextLog.logMessage(level, content);
            else
                System.out.println("Invalid execute level");
        }
    }
    
    public void addLog(AbstractLog log){
        if(this.nextLog == null)
            this.setNextLog(log);
        else
            this.nextLog.addLog(log);
    }
    
    protected abstract void write (String content);
}
