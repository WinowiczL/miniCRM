package app;

import java.util.NoSuchElementException;

public enum Option {
	EXIT(0, "EXIT"), ADD_CLIENT(1, "Add Client"), PRINT_CLIENTS(2, "Show Clients from this session"), SAVE_TO_FILE(3, "Save to file"), PRINT_ALL_CLIENTS(4, "Show all your Clients");

	private int value;
	private String description;

	public int gerValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	Option(int value, String description) {
		this.value = value;
		this.description = description;
	}

	@Override
	public String toString() {
		return value + " " + description;
	}

	public static Option createFromInt(int option) throws NoSuchElementException {
		Option result = null;
		try {
			result = Option.values()[option];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException("Wrong option");
		}
		return result;
	}

}
