package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import data.BookOfClients;
import data.Client;

public class IO {

	String fileName = "Clients.txt";
	BookOfClients boc = new BookOfClients();
	String allClients;

	public void createFile() {

		File file = new File(fileName);
		boolean fileExists = file.exists();
		if (!fileExists) {
			try {
				fileExists = file.createNewFile();
			} catch (IOException e) {
				System.out.println("Something goes wrong");
			}
		}

		if (fileExists)
			System.out.println("File " + fileName + " created");
	}

	public void writeFile(List<Client> clients) {
		try (FileWriter fileWriter = new FileWriter(fileName, true);
				BufferedWriter writer = new BufferedWriter(fileWriter);

		) { for(Client client : clients) {
				writer.write(client.toString() + "\n");
			}
			

		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NullPointerException e2) {
			e2.printStackTrace();
		}

	}

	public void readFile() {
		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader reader = new BufferedReader(fileReader);) {
			String nextLine = null;
			while ((nextLine = reader.readLine()) != null) {
				System.out.println(nextLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
