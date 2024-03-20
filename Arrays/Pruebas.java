package Arrays;

public class Pruebas {
	public static void main(String[] args) {
		/* --- Forma 1 --- */
		/*
		 * int[] a = new int[4];
		 * a[0]=9;
		 * a[1]=12;
		 * a[2]=18;
		 * a[3]=27;
		 */
		/***************************/
		
		/* --- Forma 2 --- */
		int[] a = { 9, 12, 18, 27 }; 
		/***************************/

		// Metodos.imprimir(a); //ej0

		// System.out.println("El maximo elemento es: "+Metodos.maximo(a)); //ej1

		// System.out.println("El promedio es: "+Metodos.promedio(a)); //ej2

		// System.out.print("Array original: "); //ej3
		// Metodos.imprimir(a);
		// System.out.print("\nArray actual: ");
		// int b[] = Metodos.agregarAtras(a, 5);
		// Metodos.imprimir(b);

		Metodos.quitar(a, 0); // ej4
	}
}
