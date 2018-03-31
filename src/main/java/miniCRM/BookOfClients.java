package miniCRM;

public class BookOfClients {

	public static void main(String[] args) {
		final String appName = "miniCRM";
		
		Client client1 = new Client("Adam","Małysz", "Miły koleś","14grudnia2018","Ciążowa",500);
		Client client2 = new Client("Adam","Małysz", "Miły koleś","14grudnia2018","Ciążowa",500);
		Client client3 = new Client("Adam","Małysz", "Miły koleś","14grudnia2018","Ciążowa",500);
		
		System.out.println("Aplikacja: " + appName + "\n");
		client1.printInfo();
		System.out.println();
		client2.printInfo();
		System.out.println();
		client3.printInfo();
	
		

	}

}
