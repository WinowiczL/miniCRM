package utils;

import data.*;


import java.io.*;

public class IO {

	String fileName = "Clients.txt";
	BookOfClients boc = new BookOfClients();
	
    public void createFile() {
    
        File file = new File(fileName);
        boolean fileExists = file.exists();
        if(!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something goes wrong");
            }
        }

        if(fileExists)
            System.out.println("File " + fileName + " created");
    }



    public void writeFile(Client[] clients) {
        try(
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {
        	 { for(Client client : clients)
                writer.write(client.toString());
        	}

            } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    public void readFile() {
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

