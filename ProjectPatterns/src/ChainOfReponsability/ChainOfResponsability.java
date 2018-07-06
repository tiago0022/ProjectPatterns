package ChainOfReponsability;

public class ChainOfResponsability {
    
    private static AbstractLog chainOfLog;

    public AbstractLog getChainOfLog() {
        return chainOfLog;
    }
    
    public static void main(String[] args) {
        
        ChainOfResponsability.chainOfLog = new ErrorLog();
        ChainOfResponsability.chainOfLog.addLog(new FileLog());
        ChainOfResponsability.chainOfLog.addLog(new ConsoleLog());
    
        ChainOfResponsability.chainOfLog.logMessage(Nivel.INFO.ordinal(), "Enviando uma mensagem");
        System.out.println("------------------------------");
        ChainOfResponsability.chainOfLog.logMessage(Nivel.DEBUG.ordinal(), "Enviando uma mensagem");
        System.out.println("------------------------------");
        ChainOfResponsability.chainOfLog.logMessage(Nivel.ERROR.ordinal(), "Enviando uma mensagem");
        System.out.println("------------------------------");
    }
    
}
