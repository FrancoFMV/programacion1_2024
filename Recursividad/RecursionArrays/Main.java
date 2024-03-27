package RecursionArrays;

public class Main {

	public static void main(String[] args) {
		int [] a= {20, 4, 6, 5};
		int [] b= {15, 15, 25, 30};
		
		/* Ejercicio 1 */
//		Metodos.imprimir(a);  
		
		/* Ejercicio 2 */
		// System.out.print("Array original: "); 
		// Metodos.imprimir(a);
		// System.out.print("\nArray actual:");
		// System.out.print(Metodos.suma(a));

		/* Ejercicio 3 */
		// System.out.println(Metodos.estaOrdenado(a));  
		// System.out.println(Metodos.estaOrdenado(b));

		/* Ejercicio 4 */
		// int num = 15;  
		// System.out.println(num +" aparece "+ Metodos.cantidadApariciones(a, num)+" veces");
		// System.out.println(num +" aparece "+ Metodos.cantidadApariciones(b, num)+" veces");

		/* Ejercicio 5 */
		int num = 4;
		System.out.println(num+" Aparece? "+Metodos.pertenece(a, num));
		System.out.println(num+" Aparece? "+Metodos.pertenece(b, num));
	}
}
