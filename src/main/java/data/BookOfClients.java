package data;

public class BookOfClients {

	public final static int MAX_CLIENTS = 100;
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

	public void addClient(Client client) throws ArrayIndexOutOfBoundsException {
		if (clientNumber == MAX_CLIENTS) {
			throw new ArrayIndexOutOfBoundsException("MAX_CLIENTS: " + MAX_CLIENTS);
		}
		clients[clientNumber] = client;
		clientNumber++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < clientNumber; i++) {
			builder.append(clients[i] + "\n");
		}
		return builder.toString();
	}
}
