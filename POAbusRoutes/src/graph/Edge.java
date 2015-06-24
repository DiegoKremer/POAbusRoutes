package graph;

public class Edge {
	
	private Vertex originVertice;
	private Vertex destinyVertice;
	private Double cost;

	public Edge (Vertex originVertice, Vertex destinyVertice) {
		this.originVertice = originVertice;
		this.destinyVertice = destinyVertice;
		this.cost = calculateCost(originVertice, destinyVertice);
		
	}

	public Vertex getOriginVertice() {
		return originVertice;
	}

	public void setOriginVertice(Vertex originVertice) {
		this.originVertice = originVertice;
	}

	public Vertex getDestinyVertice() {
		return destinyVertice;
	}

	public void setDestinyVertice(Vertex destinyVertice) {
		this.destinyVertice = destinyVertice;
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
	
	
}
