package utils;

import data.Client;

public class BookOfClients {

	public static void main(String[] args) {
		final String appName = "miniCRM";
		
		Client[] clients = new Client[2000];
		
		clients[0] = new Client("Adam","Małysz", "Miły koleś","14grudnia2018","Ciążowa",500);
		clients[1] = new Client("Adam","Małysz", "Miły koleś","14grudnia2018","Ciążowa",500);
		clients[2] = new Client("Adam","Małysz", "Miły koleś","14grudnia2018","Ciążowa",500);
		
		System.out.println("Aplikacja: " + appName + "\n");
		clients[0].printInfo();
		System.out.println();
		clients[1].printInfo();
		System.out.println();
		clients[2].printInfo();
	
		

	}

}
