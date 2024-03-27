package PointYRectangle;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Point p1= new Point (3,0);
		Point p2 = new Point (3,4);
		
		/* Ejercicio 1 */
		System.out.println(Metodos.distancia(p1,p2));
		
		/* Ejercicio 2 */
		Rectangle r = new Rectangle(0,0,3,4);
		System.out.println(Metodos.diagonal(r));
	}

}
