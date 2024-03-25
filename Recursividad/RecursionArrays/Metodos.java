package RecursionArrays;

public class Metodos {

	public static void imprimir(int[]a){
		System.out.print("[");
		imprimirEntre(a, 0, a.length-1);
		System.out.print("]");
	}
	public static void imprimirEntre(int[] array, int inicio, int fin) {
		if(inicio>fin) {
			return;
		}
		else {
			System.out.print(array[inicio]+" ");
			imprimirEntre(array,inicio+1,fin);
		}
	}
	
	 public static int suma(int[] a) {
		 return sumaAux(a,0,a.length-1);
		 
	 }
	 static int sumaAux(int[] array, int inicio, int fin) {
		 if(inicio>fin) {
			 return 0;
		 }else { 
//			 System.out.print(array[inicio]); /*Linea de prueba*/
//			 ;
//			 int result= array[inicio];
//			 System.out.print(result);
			 return array[inicio] + sumaAux(array, inicio+1, fin);
		 }
		 
	 }
		 
}
