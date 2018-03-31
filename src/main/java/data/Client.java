package data;

public class Client {

	private String firstName;
	private String lastName;
	private String description;
	private String dateOfSession;
	private String typeOfSession;
	private int priceOfSession;
	
	public Client (String firstName, String lastName, String description, String dateOfSession, String typeOfSession, int priceOfSession) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
		this.dateOfSession = dateOfSession;
		this.typeOfSession = typeOfSession;
		this.priceOfSession = priceOfSession;
	}
	
	public Client(Client client) {
		this(client.firstName,client.lastName, client.description, client.dateOfSession, client.typeOfSession, client.priceOfSession);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return lastName;
	}
	public void setSecondName(String secondName) {
		this.lastName = secondName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateOfSession() {
		return dateOfSession;
	}
	public void setDateOfSession(String dateOfSession) {
		this.dateOfSession = dateOfSession;
	}
	public String getTypeOfSession() {
		return typeOfSession;
	}
	public void setTypeOfSession(String typeOfSession) {
		this.typeOfSession = typeOfSession;
	}
	public int getPriceOfSession() {
		return priceOfSession;
	}
	public void setPriceOfSession(int priceOfSession) {
		this.priceOfSession = priceOfSession;
	}

	public void printInfo () {
		System.out.println("Imię klienta: " + firstName + "\nNazwisko klienta: " + lastName + "\nOpis: " + description 
				+ "\nData sesji: " + dateOfSession + "\nTyp sesji: " + typeOfSession + "\nCena sesji: " + priceOfSession);
	}
	
}
