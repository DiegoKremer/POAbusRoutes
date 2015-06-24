package graph;

import java.util.Vector;



public class Graph {
	
	private Vector<Vertex> vertices;
	private Vector<Edge> edges;
	
	
	public Graph () {
		this.vertices = new Vector<Vertex>();
		this.edges = new Vector<Edge>();
	}
	
	public void addVector(Vertex vertex) {
		vertices.add(vertex);
	}
	
	public void addEdge (Edge edge) {
		edges.add(edge);
	}
	

	public Vertex getVertex(int vertexIndex) {
		return vertices.get(vertexIndex);
	}
	
	public void getBestPath () {
		
	}
	
	public void getTotalDistance () {
		
	} 

}
