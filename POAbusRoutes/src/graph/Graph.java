package graph;

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
		Stack<Edge> stack = new Stack<Edge> ();
		
		/* Initialize Visited */
		Vector<Edge> visited = new Vector<Edge>();	
		
		/* Initialize Costs*/
		Vector cost = new Vector();
		
		/* Initialize Previous */
		Vector previous = new Vector();
		
		/* Cost vector origin point starts with 0 */
		cost.add(originIndex, 0);
		
		stack.add(edges.get(originIndex));
		while (!stack.isEmpty()) {
			Edge n = stack.firstElement();
			if (visited.contains(n)) {
				break;
			} else {
				
			}
		}
		
	}
	
	public void getTotalDistance () {
		
	} 

}
