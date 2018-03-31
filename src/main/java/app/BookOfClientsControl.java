package app;

import data.BookOfClients;
import data.Client;
import utils.DataReader;

public class BookOfClientsControl {

	public final static int EXIT = 0;
	public final static int ADD_CLIENT = 1;
	public final static int PRINT_CLIENTS = 2;

	private DataReader dataReader;
	private BookOfClients bookOfClients;

	public BookOfClientsControl() {
		dataReader = new DataReader();
		bookOfClients = new BookOfClients();
	}

	public void controlLoop() {
		int option;
		printOptions();
		while ((option = dataReader.getInt()) != EXIT) {
			switch (option) {
			case ADD_CLIENT:
				addClient();
				break;
			case PRINT_CLIENTS:
				printClients();
				break;
			default:
				System.out.println("Bad value, please repeat");
			}
			printOptions();
		}
		dataReader.close();
	}

	private void printOptions() {
		System.out.println("Choose option: ");
		System.out.println("0 - Exit");
		System.out.println("1 - Add Client");
		System.out.println("2 - Show Clients");
	}

	public void addClient() {
		Client client = dataReader.readAndCreateClient();
		bookOfClients.addClient(client);
	}

	public void printClients() {
		bookOfClients.printClients();
		System.out.println();
	}
}
