package app;

import data.BookOfClients;
import data.Client;
import utils.BookOfClientsUtils;
import utils.DataReader;
import utils.IO;

public class BookOfClientsControl {

	private DataReader dataReader;
	private BookOfClients bookOfClients;
	IO io = new IO();

	public BookOfClientsControl() {
		dataReader = new DataReader();
		bookOfClients = new BookOfClients();
		
	}

	public void controlLoop() {
		Option option;
		printOptions();
		while ((option = Option.createFromInt(dataReader.getInt())) != Option.EXIT) {
			switch (option) {
			case ADD_CLIENT:
				addClient();
				break;
			case PRINT_CLIENTS:
				printClients();
				break;
			case SAVE_TO_FILE:
				io.writeFile(bookOfClients.getClients());
				break;
			case PRINT_ALL_CLIENTS:
				io.readFile();
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
		for (Option o: Option.values()) {
			System.out.println(o);
		}
	}

	public void addClient() {
		Client client = dataReader.readAndCreateClient();
		bookOfClients.addClient(client);		
	}

	public void printClients() {
		BookOfClientsUtils.printClients(bookOfClients);
	}
}
