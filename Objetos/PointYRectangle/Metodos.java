package PointYRectangle;

import java.awt.*;

public class Metodos {
	
	/* Ejercicio 1 */
	public static double distancia(Point p1, Point p2) {
		int dx=p1.x-p2.x;
		int dy=p1.y-p2.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	/* Ejercicio 2*/
	public static double diagonal(Rectangle r) {
		Point p1 = new Point (r.x, r.y);
		Point p2 = new Point (r.x + r.width, r.y + r.height);
		return distancia(p1, p2);
	}
	
	/* Ejercicio 3*/
//	public static Point centro(Rectangle r) {
//		
//	}

}
