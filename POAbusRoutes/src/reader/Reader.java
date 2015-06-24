package reader;

import graph.Edge;
import graph.Vertice;

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
	
	public Vertice buildVertice (String dataContent) {
		Scanner dataScan = new Scanner (dataContent);
		dataScan.useDelimiter(" ");
		int index = dataScan.nextInt();
		String coord1 = dataScan.next();
		String coord2 = dataScan.next();
		
		Scanner coordScan1 = new Scanner (coord1);
		coordScan1.useDelimiter(",");
		int x1 = coordScan1.nextInt();
		int y1 = coordScan1.nextInt();
		
		Scanner coordScan2 = new Scanner (coord2);
		coordScan2.useDelimiter(",");
		int x2 = coordScan2.nextInt();
		int y2 = coordScan2.nextInt();
		
		Vertice v = new Vertice (index, x1, y1, x2, y2);
		dataScan.close();
		coordScan1.close();
		coordScan2.close();
		return v;
	}
	
	public Edge buildEdge (String dataContent) {
		Scanner dataScan = new Scanner (dataContent);
		dataScan.useDelimiter(" ");
		int originVertice;
		int destinyVertice;
		int cost;
		
		Edge e = new Edge (originVertice, destinyVertice, cost);
		return e;
	}
	
	

}
