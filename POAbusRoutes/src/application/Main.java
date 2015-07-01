package application;

import java.io.FileNotFoundException;

import graph.Graph;
import reader.Reader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Graph graph = new Graph ();
		Reader reader = new Reader ();
		
		reader.fileReader(graph);
		
		//graph.getBestPath(0, 102);
		
		//graph.printAllVertices();
		//graph.printAllEdges();

	}

}
