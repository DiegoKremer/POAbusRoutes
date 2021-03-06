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
		String dataType = "vertices";
		while (reader.hasNext()) {

			
			String readerData = reader.nextLine();
			//System.out.println(dataType);
			if (readerData.equals("vertices")) {
				readerData = reader.nextLine();
			} else if (readerData.equals("arestas")) {
				//System.out.println("Verificou que � uma aresta.");
				dataType = "arestas";
				readerData = reader.nextLine();
			} 

			String dataContent = readerData.replace(",", ".");

			

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
		// System.out.println(dataContent);

		int index = dataScan.nextInt();
		Double x = Double.valueOf(dataScan.next());
		Double y = Double.valueOf(dataScan.next());

		Vertex v = new Vertex(index, x, y);
		dataScan.close();
		return v;
	}

	/* Build an Edge object using the data read */

	public Edge buildEdge(String dataContent, Graph graph) {
		//System.out.println("Construindo Arestas????");
		Scanner dataScan = new Scanner(dataContent);
		//System.out.println(dataContent);
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
