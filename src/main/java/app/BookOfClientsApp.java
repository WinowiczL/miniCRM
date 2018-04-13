package app;

public class BookOfClientsApp {
	public static final String APP_NAME = "BookOfClients";

	public static void main(String[] args) {
		
		System.out.println(APP_NAME);
		BookOfClientsControl control = new BookOfClientsControl();
		control.controlLoop();

	}

}
