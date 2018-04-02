package utils;

import data.BookOfClients;
import data.Client;

public class BookOfClientsUtils {

	public static void printClients(BookOfClients book) {
		Client[] clients = book.getClients();
		int clientNumber = book.getClientNumber();
		int countClients = 0;
		for (int i = 0; i < clientNumber; i++) {
			System.out.println(clients[i]);
			countClients++;
		}
		if (countClients == 0) {
			System.out.println("Brak Klientów w książce");
		}
	}
}
