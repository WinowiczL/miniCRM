package data;

import java.util.ArrayList;
import java.util.List;

public class BookOfClients {

	public List<Client> listOfClients = new ArrayList<>();

	
	
	public void addClient(Client client) {
		listOfClients.add(client);
		}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Client client : listOfClients) {
			builder.append(client + "\n");
		}
		return builder.toString();
	}
}
