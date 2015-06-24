package graph;

public class Edge {
	
	private int originVertice;
	private int destinyVertice;
	private int cost;

	public Edge (int originVertice, int destinyVertice, int cost) {
		this.originVertice = originVertice;
		this.destinyVertice = destinyVertice;
		this.cost = cost;
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
	
	
}
