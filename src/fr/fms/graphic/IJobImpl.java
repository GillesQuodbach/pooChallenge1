package fr.fms.graphic;

import java.util.*;

public class IJobImpl implements IJob {
	private Map<Integer, Shape> shapes;
	
	public IJobImpl() {
		shapes = new HashMap<>();
	}
	
	@Override
	public void addShape(int id, Shape shape) {
		shapes.put(id, shape);
	}
	
	@Override
	public void deleteShape(int id) {
		shapes.remove(id);
	}
	
	@Override 
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}
	
	@Override
	public void moveShape(int id, int x, int y) {
		Shape shape = shapes.get(id);
//		shape.getCenter().setX(x);
//		shape.getCenter().setY(y);	
	}
	
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void displayAll() {
		for(Shape s : shapes.values()) {
			System.out.println(s);
		}
	}
}
