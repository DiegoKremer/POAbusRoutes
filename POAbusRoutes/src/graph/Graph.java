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
			visited.add(originIndex, false);
		

		Vector<Edge> adjacents = new Vector<Edge>();

		/* Initialize Costs */

		Vector<Double> costs = new Vector<Double>();

		for (int i = 0; i < vertices.size(); i++) {
			costs.add(i, Double.MAX_VALUE);
		}

		/* Initialize Previous */
		Vector<Vertex> previous = new Vector<Vertex>();

		/* Cost vector origin point starts with 0 */
		costs.add(originIndex, 0.0);

		stack.add(vertices.get(originIndex));

		while (!stack.isEmpty()) {
			System.out.println("ENTRA NO WHILE DO DIJKSTRA");
			Vertex element = stack.firstElement();
			for (int i = 0; i < stack.size(); i++) {
				if (visited.get(i).equals(element)) {
					System.out.println("VERIFICA VISITADO");
					break;
				}

				/* Get adjacents vertices */
				for (int edgesIndex = 0; edgesIndex < edges.size(); edgesIndex++) {
					System.out.println(edges.size());
					System.out.println("FAZ LOOP DOS VERTICES ADJACENTES" + " - " + edgesIndex);
					if (edges.get(edgesIndex).getDestinyVertex()
							.equals(element)) {
						System.out.println("ADICIONA OS ADJACENTES ENCONTRADOS");
						adjacents.add(edges.get(edgesIndex));
					}
				}
				/* Para cada vértice (v) vizinho de n: */
				for (int adjacentsIndex = 0; adjacentsIndex < adjacents.size(); adjacentsIndex++) {
					System.out.println("CÓDIGO DOS CUSTOS");
					/* custo = custos[n] + custo(n,v) */
					double cost = costs.get(originIndex)
							+ adjacents.get(adjacentsIndex).getCost();
					/* Se custo < custos(v): */
					if (cost < costs.get(adjacents.get(adjacentsIndex)
							.getDestinyVertex().getIndex())) {
						/* custos[v] = custo */
						costs.add(adjacents.get(adjacentsIndex)
								.getDestinyVertex().getIndex(), cost);
						/* anterior[v] = n */
						previous.add(adjacents.get(adjacentsIndex)
								.getDestinyVertex().getIndex(), element);
					}
					/* Se não visitou v */
					if (visited.get(adjacents.get(adjacentsIndex)
							.getDestinyVertex().getIndex()) == false) {
						/* adiciona v à Pilha */
						stack.push(adjacents.get(adjacentsIndex)
								.getDestinyVertex());
					}
				}
				/* Marca n como visitado */
				visited.add(element.getIndex(), true);

			}

		}

	}

	public void getTotalDistance() {

	}
	
	public void printAllVertices () {
		
		for (int i = 0; i < vertices.size(); i++) {
			System.out.println(vertices.get(i).toString());
		}
	}
	
	public void printAllEdges () {
		for (int i = 0; i < edges.size(); i++) {
			System.out.println(edges.get(i).toString());
		}
	}

}
