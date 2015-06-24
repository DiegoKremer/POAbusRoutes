package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
	
	public void fileReader () throws FileNotFoundException {
		
		/* Creates the scanner that will read the file in the given path */
		Scanner reader = new Scanner (new File("src/resources/grafo.txt"));
		
		/* Set the character that will be used to delimit the file fields */
		reader.useDelimiter(" ");
		
		
		
		while (reader.hasNext()) {
			
			
			String dataType = reader.next();
			String dataContent; reader.nextLine();
			
			if (dataType.equals("vertices")) {
				
			} else if (dataType.equals("arestas")) {
				
			}
			
		} 
		
		reader.close();
		
	}

}
