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
		Stack<Vertex> stack = new Stack<Vertex> ();
		
		/* Initialize Visited */
		Vector<Boolean> visited = new Vector<Boolean>();
		visited.set(originIndex, false);
		
		Vector<Edge> adjacents = new Vector<Edge>();
		
		/* Initialize Costs*/
		
		Vector<Double> costs = new Vector<Double> ();
		
		for (int i = 0; i < vertices.size(); i++) {
			costs.add(i, Double.MAX_VALUE);
		}
		
		/* Initialize Previous */
		Vector<Vertex> previous = new Vector<Vertex> ();
		
		/* Cost vector origin point starts with 0 */
		costs.add(originIndex, 0.0);
		
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
						adjacents.add(edges.get(edgesIndex));
					}
				}
				/* Para cada v�rtice (v) vizinho de n: */
				for (int adjacentsIndex = 0; adjacentsIndex < adjacents.size(); adjacentsIndex++) {
					/* custo = custos[n] + custo(n,v) */
					double cost = costs.get(originIndex) + adjacents.get(adjacentsIndex).getCost();
					/* Se custo < custos(v): */
					if (cost < costs.get(adjacents.get(adjacentsIndex).getDestinyVertex().getIndex())) {
						/* custos[v] = custo */
						costs.add(adjacents.get(adjacentsIndex).getDestinyVertex().getIndex(), cost);
						/* anterior[v] = n  */
						previous.add(adjacents.get(adjacentsIndex).getDestinyVertex().getIndex(), element);
					}
					/* Se n�o visitou v */
					if (visited.get(adjacents.get(adjacentsIndex).getDestinyVertex().getIndex()) == false) {
						/*  adiciona v � Pilha */
						stack.push(adjacents.get(adjacentsIndex).getDestinyVertex());
					}
				}
				/* Marca n como visitado */
				visited.add(element.getIndex(), true);
				
				
			}
				
			
		}
		
	}
	
	public void getTotalDistance () {
		
	} 

}
