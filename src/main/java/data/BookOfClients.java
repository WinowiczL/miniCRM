package data;

public class BookOfClients {

	public final static int MAX_CLIENTS = 2000;
	private Client[] clients;
	private int clientNumber;

	public BookOfClients() {
		clients = new Client[MAX_CLIENTS];
	}

	public Client[] getClients() {
		return clients;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void addClient(Client client) {
		if (clientNumber < MAX_CLIENTS) {
			clients[clientNumber] = client;
			clientNumber++;
		} else {
			System.out.println("To many Clients in your Book");
		}
	}

	public void printClients() {
		if (clients[0] == null) {
			System.out.println("Your Book of Clients is empty");
		}
		for (int i = 0; i < clientNumber; i++) {
			System.out.println(clients[i]);
		}
	}
}
