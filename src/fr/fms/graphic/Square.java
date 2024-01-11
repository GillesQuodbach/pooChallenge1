package fr.fms.graphic;

public class Square {
	private int x;
	private int y;
	private int side;
	
	public Square(int side, int x, int y) {
		setSide(side);
		setX(x);
		setY(y);
	}
	
	public Square(int side, Point center) {
		setSide(side);
		setX(0);
		setY(0);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getSide() {
		return side;
	}
	
	public void setSide(int side) {
		if (side < 0) side = 1;
		else this.side = side;
	}
}
