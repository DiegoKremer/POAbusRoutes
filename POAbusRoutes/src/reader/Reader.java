package reader;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

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
	
	public Vertex buildVertice (String dataContent) {
		Scanner dataScan = new Scanner (dataContent);
		dataScan.useDelimiter(" ");
		int index = dataScan.nextInt();
		Double x = dataScan.nextDouble();
		Double y = dataScan.nextDouble();
		
	
		
		Vertex v = new Vertex (index, x, y);
		dataScan.close();
		return v;
	}
	
	public Edge buildEdge (String dataContent) {
		Scanner dataScan = new Scanner (dataContent);
		dataScan.useDelimiter(" ");
		int originVertexIndex = dataScan.nextInt();
		int destinyVertexIndex = dataScan.nextInt();
		int cost = dataScan.nextInt();
		
		
		Graph.getVertex(destinyVertexIndex);
		Vertex originVertex = Graph.getVertex(originVertexIndex);
		Vertex destinyVertex = Graph.getVertex(originVertexIndex);  
		
		
		Edge e = new Edge (originVertex, destinyVertex);
		return e;
	}
	
	

}
