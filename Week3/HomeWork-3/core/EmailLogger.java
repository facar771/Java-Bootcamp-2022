package core;

public class EmailLogger implements Logger{
	public void log(String data) {
		System.out.println("Log kaydı eposta olarak gönderildi : "+ data);
	}
}
