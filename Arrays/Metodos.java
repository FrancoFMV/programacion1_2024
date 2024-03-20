package Arrays;

public class Metodos {
	public static void imprimir(int[] a) { // ej0
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++) { // Poner a.length-1 para que no repita la ultima posición
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[a.length - 1]);
		System.out.print("]");
	}

	public static int maximo(int[] a) { // ej1
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]); /*Linea de prueba*/
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static double promedio(int[] a) { // ej2
		double promedio = 0;
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
			// System.out.println(suma); /*Linea de prueba*/
			promedio = suma / a.length;
		}
		return promedio;
	}

	public static int[] agregarAtras(int[] a, int x) { // ej3
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[a.length] = x;
		return b;
	}

	public static int[] quitar(int[] a, int pos) { // ej4

		return a;
	}
}
