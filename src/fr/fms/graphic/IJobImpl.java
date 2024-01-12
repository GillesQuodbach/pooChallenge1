package fr.fms.graphic;

import java.util.*;

public class IJobImpl implements IJob {

	private Map<Integer, Shape> shapes;

	public IJobImpl() {
		shapes = new HashMap<>();
	}


	public void addShape(int id, Shape shape) {
		shapes.put(id, shape);
	}
	
	public void deleShape(int id) {
		shapes.remove(id);
	}
	
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}
	
	public void moveShape(int id, int x, int y) {
		Shape shape = shapes.get(id);
//		shape.getCenter().setX(x);
//		shape.getCenter().setX(y);
	}
	
	public void drawShape() {
		
	}
	
	public void displayAll() {
		for (Shape s : shapes.values()) {
			System.out.println(s);
		}
		
	}
	
	public void squaresPerimeter() {
		Iterator<Shape> it = shapes.values().iterator();
		while(it.hasNext()) {
			Shape shape = it.next();
			if(shape instanceof Square) {
				System.out.println(shape + " périmètre = " + ((Square)shape).perimeter());
			}
		}
	}

}
