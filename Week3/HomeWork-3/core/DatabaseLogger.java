package core;

public class DatabaseLogger implements Logger{
	public void log(String data) {
		System.out.println("Log kaydı database olarak gönderildi : "+ data);
	}
}
