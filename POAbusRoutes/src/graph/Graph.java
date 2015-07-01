package graph;

import java.util.Stack;
import java.util.Vector;

public class Graph {

	private Vector<Vertex> vertices;
	private Vector<Edge> edges;

	public Graph() {
		this.vertices = new Vector<Vertex>();
		this.edges = new Vector<Edge>();
	}

	public void addVector(Vertex vertex) {
		vertices.add(vertex.getIndex(), vertex);
	}

	public void addEdge(Edge edge) {
		edges.add(edge);
	}

	public Vertex getVertex(int vertexIndex) {
		return vertices.get(vertexIndex);
	}

	public void getBestPath(int originIndex, int destinyIndex) {

		Stack<Vertex> stack = new Stack<Vertex>();

		/* Initialize Visited */
		Vector<Boolean> visited = new Vector<Boolean>();
		
		for (int i = 0; i < vertices.size(); i++) {
			visited.add(i, false);
		}
		
		/* Adjacents vector */
		Vector<Edge> adjacents = new Vector<Edge>();

		/* Initialize Costs with Infinite Value */

		Vector<Double> costs = new Vector<Double>();

		for (int i = 0; i < vertices.size(); i++) {
			costs.add(i, Double.MAX_VALUE);
		}

		/* Initialize Previous */
		Vector<Vertex> previous = new Vector<Vertex>();

		/* Cost vector origin point starts with 0 */
		costs.add(originIndex, 0.0);
		
		stack.add(vertices.get(originIndex));
		
		//System.out.println("ORIGIN VERTEX IS: " + vertices.get(originIndex).toString());
		while (!stack.isEmpty()) {
			//System.out.println("ENTERS DIJKSTRA WHILE LOOP");
			Vertex element = stack.pop();
			//System.out.println("STACK POP ELEMENT IS: "+ element.toString());
			for (int i = 0; i < visited.size(); i++) {
				if (visited.get(i).equals(element) == true) {
					System.out.println("CHECKED IF VISITED");
				} else {

				/* Get adjacents vertices */
				for (int edgesIndex = 0; edgesIndex < edges.size(); edgesIndex++) {
					//System.out.println("VERIFICANDO QUAIS OS VERTICES ADJACENTES"
					//		+ " - " + edgesIndex + " - " + edges.size());
					if (edges.get(edgesIndex).getOriginVertex()
							.equals(element)) {
					//System.out
					//			.println("ADICIONA OS ADJACENTES ENCONTRADOS NO VETOR");
						adjacents.add(edges.get(edgesIndex));
					}
				}
				/* Para cada vértice (v) vizinho de n: */
				for (int adjacentsIndex = 0; adjacentsIndex < adjacents.size(); adjacentsIndex++) {
					//System.out.println("VERIFICANDO OS CUSTOS" + adjacents.size());
					/* custo = custos[n] + custo(n,v) */
					double cost = costs.get(element.getIndex())
							+ adjacents.get(adjacentsIndex).getCost();
					System.out.println("CURRENT ELEMENT IS: " + element.toString());
					System.out.println("ELEMENT COST " + element.toString() + " IS: " + costs.get(element.getIndex()));
					System.out.println("ELEMENT NEIGHBOUR COST: " + adjacents.get(adjacentsIndex).getCost());
					System.out.println("COST VALUE: " + cost);
					System.out.println("THE NEIGHBOUR IS: " + adjacents.get(adjacentsIndex).getDestinyVertex().toString());
					/* Se custo < custos(v): */
					if (cost < costs.get(adjacents.get(adjacentsIndex)
							.getDestinyVertex().getIndex())) {
						System.out.println("CHECK IF COST IS LESS THAN ITS NEIGHBOUR");
						/* custos[v] = custo */
						costs.add(adjacents.get(adjacentsIndex)
								.getDestinyVertex().getIndex(), cost);
						/* anterior[v] = n */
						previous.add(element);
					}
					/* Se não visitou v */
					if (visited.get(adjacents.get(adjacentsIndex)
							.getDestinyVertex().getIndex()) == false) {
						System.out.println("ADD TO STACK IF NOT VISITED");
						/* adiciona v à Pilha */
						stack.add(adjacents.get(adjacentsIndex)
								.getDestinyVertex());
						System.out.println("WHAT DOES THE STACK CONTAINS HERE? " + stack.toString());
					} 
						
					
				} 
				
				/* Marca n como visitado */
				System.out.println("FINAL ELEMENT IS " + element.toString());
				visited.add(element.getIndex(), true);
				System.out.println("SET AS VISITED");
				
			}

		}
		for (int i = 0; i < previous.size(); i++)
			System.out.println(previous.get(i).toString());
		}
	}

	public void getTotalDistance() {

	}

	public void printAllVertices() {

		for (int i = 0; i < vertices.size(); i++) {
			System.out.println(vertices.get(i).toString());
		}
	}

	public void printAllEdges() {
		for (int i = 0; i < edges.size(); i++) {
			System.out.println(edges.get(i).toString());
		}
	}

}
