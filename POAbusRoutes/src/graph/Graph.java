package graph;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;



public class Graph {
	
	private Vector<Vertex> vertices;
	private Vector<Edge> edges;
	
	
	public Graph () {
		this.vertices = new Vector<Vertex>();
		this.edges = new Vector<Edge>();
	}
	
	public void addVector(Vertex vertex) {
		vertices.add(vertex.getIndex(), vertex);
	}
	
	public void addEdge (Edge edge) {
		edges.add(edge);
	}
	

	public Vertex getVertex(int vertexIndex) {
		return vertices.get(vertexIndex);
	}
	
	public void getBestPath (int originIndex, int destinyIndex) {
		Stack<Vertex> stack = new Stack<Vertex> ();
		
		/* Initialize Visited */
		Vector<Boolean> visited = new Vector<Boolean>();
		visited.set(originIndex, false);
		
		Vector<Vertex> adjacents = new Vector<Vertex>();
		
		/* Initialize Costs*/
		
		Vector<Integer> costs = new Vector<Integer> ();
		
		for (int i = 0; i < vertices.size(); i++) {
			costs.add(i, Integer.MAX_VALUE);
		}
		
		/* Initialize Previous */
		Vector<Vertex> previous = new Vector<Vertex> ();
		
		/* Cost vector origin point starts with 0 */
		costs.add(originIndex, 0);
		
		stack.add(vertices.get(originIndex));
		while (!stack.isEmpty()) {
			Vertex element = stack.firstElement();
			for (int i = 0; i < stack.size(); i++) {
				if (visited.get(i).equals(element)) {
					break;
				}
				
				/* Get adjacents vertices */
				for (int edgesIndex = 0;  edgesIndex < edges.size(); edgesIndex++) {
					if (edges.get(edgesIndex).getDestinyVertex().equals(element)) {
						adjacents.add(edges.get(edgesIndex).getDestinyVertex());
					}
				}
				
				for (int adjacentsIndex = 0; adjacentsIndex < adjacents.size(); adjacentsIndex++) {
					
				}
				
				
			}
				
			
		}
		
	}
	
	public void getTotalDistance () {
		
	} 

}
