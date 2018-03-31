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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfSession == null) ? 0 : dateOfSession.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + priceOfSession;
		result = prime * result + ((typeOfSession == null) ? 0 : typeOfSession.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (dateOfSession == null) {
			if (other.dateOfSession != null)
				return false;
		} else if (!dateOfSession.equals(other.dateOfSession))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (priceOfSession != other.priceOfSession)
			return false;
		if (typeOfSession == null) {
			if (other.typeOfSession != null)
				return false;
		} else if (!typeOfSession.equals(other.typeOfSession))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ("Imię klienta: " + firstName + "\nNazwisko klienta: " + lastName + "\nOpis: " + description 
				+ "\nData sesji: " + dateOfSession + "\nTyp sesji: " + typeOfSession + "\nCena sesji: " + priceOfSession);
	}	
}
