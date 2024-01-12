package fr.fms.graphic;

public interface IJob {
public void addShape(int id, Shape shape);
public void deleShape(int id);
public Shape getShapeById(int id);
public void moveShape(int id, int x, int y);
public void drawShape();
public void displayAll();
}
