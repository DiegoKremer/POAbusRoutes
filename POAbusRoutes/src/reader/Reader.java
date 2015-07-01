package reader;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	public void fileReader(Graph graph) throws FileNotFoundException {

		/* Creates the scanner that will read the file in the given path */
		Scanner reader = new Scanner(new File("src/resources/grafo.txt"));

		/* Set the character that will be used to delimit the file fields */
		reader.useDelimiter(" ");

		while (reader.hasNext()) {

			String dataType = "vertices";
			String readerData = reader.nextLine();
			
			if (readerData.contains("vertices")) {
				readerData = reader.nextLine();
			} else if (readerData.contains("arestas")) {
				dataType = "arestas";
				reader.nextLine();
				readerData = reader.nextLine();
				
			} 

				String dataContent = readerData.replace(",", ".");
				
				System.out.println(dataContent);
				
				
				if (dataType.equals("vertices")) {
					graph.addVector(buildVertex(dataContent));

				} else if (dataType.equals("arestas")) {
					graph.addEdge(buildEdge(dataContent, graph));
				

			}
			

		}

		reader.close();

	}

	/* Build a Vertex object using the data read */

	public Vertex buildVertex(String dataContent) {
		Scanner dataScan = new Scanner(dataContent);
		dataScan.useDelimiter(" ");
		
		
		int index = dataScan.nextInt();
		Double x = dataScan.nextDouble();
		Double y = dataScan.nextDouble();

		Vertex v = new Vertex(index, x, y);
		dataScan.close();
		return v;
	}

	/* Build an Edge object using the data read */

	public Edge buildEdge(String dataContent, Graph graph) {
		Scanner dataScan = new Scanner(dataContent);
		dataScan.useDelimiter(" ");
		int originVertexIndex = dataScan.nextInt();
		int destinyVertexIndex = dataScan.nextInt();

		Vertex originVertex = graph.getVertex(originVertexIndex);
		Vertex destinyVertex = graph.getVertex(destinyVertexIndex);

		Edge e = new Edge(originVertex, destinyVertex);
		dataScan.close();
		return e;
	}

}
