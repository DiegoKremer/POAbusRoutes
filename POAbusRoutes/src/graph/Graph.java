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
		Vector visited = new Vector();
		visited.set(originIndex, false);
	
		
		/* Initialize Costs*/
		double cost[];
		
		for (int i = 0; i < vertices.size(); i++) {
			cost[i] = Integer.MAX_VALUE;
		}
		
		/* Initialize Previous */
		Vertex previous[];
		
		/* Cost vector origin point starts with 0 */
		cost[originIndex] = 0;
		
		stack.add(vertices.get(originIndex));
		while (!stack.isEmpty()) {
			Vertex n = stack.firstElement();
			for (int i = 0; i < visited.size(); i++) {
				if (visited.get(i).equals(n)) {
					break;
				}
				
			}
				
			
		}
		
	}
	
	public void getTotalDistance () {
		
	} 

}
