package graph;

public class Vertex {
	
	private int index;
	private Double x;
	private Double y;
	
	public Vertex (int index, Double x, Double y) {
		this.index = index;
		this.x = x;
		this.y = y;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	

	
	public String toString () {
		return "Vertex -> INDEX: "+index+" X: "+x+" Y: "+y;
		
	}
	

}