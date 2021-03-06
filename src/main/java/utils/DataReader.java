package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Client;

public class DataReader {

	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}

	public int getInt() throws InputMismatchException {
		int number = 0;
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("It isn't a number");
		} finally {
			sc.nextLine();
		}
		return number;
	}

	public Client readAndCreateClient() {
		System.out.println("Name of Client:");
		String name = sc.nextLine();
		System.out.println("Last name of Client:");
		String lastName = sc.nextLine();
		System.out.println("Description: ");
		String description = sc.nextLine();
		System.out.println("Date of Session:");
		String dateOfSession = sc.nextLine();
		System.out.println("Type of Session:");
		String typeOfSession = sc.nextLine();
		System.out.println("Price of Session:");
		int priceOfSession = sc.nextInt();
		sc.nextLine();

		return new Client(name, lastName, description, dateOfSession, typeOfSession, priceOfSession);
	}
}
