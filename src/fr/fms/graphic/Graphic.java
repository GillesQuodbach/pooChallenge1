/**
 * Programme permettant l'affichage de plusieurs formes g�om�triques
 * 
 * @author El babili - 2023
 * 
 */

package fr.fms.graphic;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Map;

import javax.swing.JFrame;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Graphic() {
		super("Voici nos formes g�om�triques !");			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);	// TAILLE FENETRE A L'OUVERTURE	
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override	//le rep�re commence en haut � gauche (0,0)
	public void paint(Graphics g) {	
		IJobImpl shapes = new IJobImpl();
		shapes.addShape(1,new Circle(20, new Point(30,50)));
		shapes.addShape(2, new Square(50, new Point(200,200)));
		shapes.addShape(3, new Square(65, new Point(200,50)));
		shapes.addShape(4, new Circle (30, new Point (300,300)));
		shapes.addShape(5, new Circle (15, new Point (100,150)));
		super.paint(g);
		
		for(int i = 1; i < 6; i++) {
			Shape shapeSelectionned = shapes.getShapeById(i);
			if(shapeSelectionned instanceof Circle) {
				Circle circleSelectionned = (Circle) shapeSelectionned;
				int radiusSelectionned = (int) circleSelectionned.getRadius();
				Point pointSelectionned = (Point) shapeSelectionned.getCenter();
				int xSelectionned = (int) pointSelectionned.getX();
				int ySelectionned = (int) pointSelectionned.getY();
				g.fillOval(xSelectionned, ySelectionned, radiusSelectionned, radiusSelectionned);
			} else {
				Square squareSelectionned = (Square) shapeSelectionned;
				int sideSelectionned = (int) squareSelectionned.getSide();
				Point pointSelectionned = (Point) shapeSelectionned.getCenter();
				int xSelectionned = (int) pointSelectionned.getX();
				int ySelectionned = (int) pointSelectionned.getY();
				g.drawRect(xSelectionned, ySelectionned, sideSelectionned, sideSelectionned);
			}
			
		}	
//		g.fillOval(150, 50, 135, 35);	// x , y , largeur , hauteur (diam�tre)
//		g.drawOval(50, 50, 145, 70);
//		g.drawRect(50, 150, 50, 50);
//		g.fillRect(150, 150, 70, 50);	
////	
////		
////		// Rajout
////		
//		Graphics2D g2d = (Graphics2D)g;
//		g2d.setPaint(new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED,true));
//		g2d.fillRect(250, 50, 70, 50);		
//		
//		g2d.fillOval(250,150,55,55);		
	}
	
	public static void main(String[] args) {
		new Graphic();
	}
}
