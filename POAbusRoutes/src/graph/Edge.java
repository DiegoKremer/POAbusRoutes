package graph;

public class Edge {
	
	private Vertex originVertex;
	private Vertex destinyVertex;
	private Double cost;

	public Edge (Vertex originVertex, Vertex destinyVertex) {
		this.originVertex = originVertex;
		this.destinyVertex = destinyVertex;
		this.cost = calculateCost(originVertex, destinyVertex);
		
	}

	public Vertex getOriginVertex() {
		return originVertex;
	}

	public void setOriginVertex(Vertex originVertice) {
		this.originVertex = originVertice;
	}

	public Vertex getDestinyVertex() {
		return destinyVertex;
	}

	public void setDestinyVertex(Vertex destinyVertice) {
		this.destinyVertex = destinyVertice;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
	/* Calculates the cost based on mathematical equation for coordinate distance */
	
	public Double calculateCost (Vertex originVertex, Vertex destinyVertex) {
		
		Double cost = Math.sqrt((Math.pow((destinyVertex.getX() - originVertex.getX()), 2)) - (Math.pow((destinyVertex.getY() - originVertex.getY()),2)));
				
		return cost;
	}
	
	public String toString () {
		return "Origin Vertex: "+originVertex+" Destiny Vertex: "+destinyVertex+" Cost: "+cost;
	}
	
}
