package app;

public class BookOfClientsApp {

	public static void main(String[] args) {
		final String appName = "BookOfClients";

		System.out.println(appName);
		BookOfClientsControl control = new BookOfClientsControl();
		control.controlLoop();

	}

}
