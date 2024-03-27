package RecursionArrays;

public class Metodos {

	/* Ejercicio 1 */
	public static void imprimir(int[] a) { 
		System.out.print("[");
		imprimirEntre(a, 0, a.length - 1);
		System.out.print("]");
	}
	public static void imprimirEntre(int[] array, int inicio, int fin) {
		if (inicio > fin) {
			return;
		} else {
			System.out.print(array[inicio] + " ");
			imprimirEntre(array, inicio + 1, fin);
		}
	}

	/* Ejercicio 2 */
	public static int suma(int[] a) { 
		return sumaAux(a, 0, a.length - 1);

	}
	static int sumaAux(int[] array, int inicio, int fin) {
		if (inicio > fin) {
			return 0;
		} else {
			return array[inicio] + sumaAux(array, inicio + 1, fin);
		}
	}

	/* Ejercicio 3 */
	public static boolean estaOrdenado(int[] a){  
		return ordenAux(a, 0);
	}
	public static boolean ordenAux(int[] array, int inicio){
		if(inicio >= array.length-1){
			return true;
		}
		else{
			if (array[inicio] <= array[inicio+1]){
				return ordenAux(array, inicio+1);
			}
		}
		return false;
	}

	/* Ejercicio 4 */
	public static int cantidadApariciones(int[] a, int n){
		return cantAux(a, n, a.length);
	}
	public static int cantAux(int[] array, int num, int lenght){
		if(lenght <= 0){
			return 0;
		}
		else{
			if(array[lenght-1] == num){
				return 1 + cantAux(array, num, lenght-1);
			}
			return 0 + cantAux(array, num, lenght-1);
		}
	}

	/* Ejercicio 5 */
	public static boolean pertenece(int[] a, int n){
		return pertAux(a, n, a.length);
	}
	public static boolean pertAux(int[] array, int num, int i){
		if(i <= 0){
			return array[i]==num;
		}
		else{
			if(cantAux(array, num, i) >= 1){
				return true;
			}
			return pertAux(array, num, i-1);
		}
	}
}
