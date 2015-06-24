package graph;

public class Edge {
	
	private Vertice originVertice;
	private Vertice destinyVertice;
	private int cost;

	public Edge (Vertice originVertice, Vertice destinyVertice) {
		this.originVertice = originVertice;
		this.destinyVertice = destinyVertice;
		this.cost = calculateCost(originVertice, destinyVertice);
		
	}

	public int getOriginVertice() {
		return originVertice;
	}

	public void setOriginVertice(int originVertice) {
		this.originVertice = originVertice;
	}

	public int getDestinyVertice() {
		return destinyVertice;
	}

	public void setDestinyVertice(int destinyVertice) {
		this.destinyVertice = destinyVertice;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int calculateCost (Vertice originVertice, Vertice destinyVertice) {
		int cost;
		
		cost = Math.sqrt((originVertice.getX1() - destinyVertice.getX2()));
				
		return cost;
	}
	
	
}
