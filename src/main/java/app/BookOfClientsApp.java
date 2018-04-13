package app;

import utils.IO;

public class BookOfClientsApp {
	public static final String APP_NAME = "BookOfClients";

	public static void main(String[] args) {

		IO io = new IO();
		System.out.println(APP_NAME);
		BookOfClientsControl control = new BookOfClientsControl();
		control.controlLoop();
		io.createFile();

	}

}
