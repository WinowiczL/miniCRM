package data;

public class BookOfClients {

	public final int maxClients = 2000;
	private Client[] clients;
	private int clientNumber;

	public BookOfClients() {
		clients = new Client[maxClients];
	}

	public Client[] getClients() {
		return clients;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void addClient(Client client) {
		if (clientNumber < maxClients) {
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
			clients[i].printInfo();
		}
	}
}
