package polymorphismDemo;

public class CustomerManager {
    private BaseLogger baselogger;
    
    public CustomerManager(BaseLogger logger) {
    	this.baselogger = logger;
    }
	public void add() {
		System.out.println("Müşteri eklendi");
		this.baselogger.log("Log mesajı");

	}

}
