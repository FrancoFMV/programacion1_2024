package arreglos;

public class Pruebas {
	public static void main(String[] args) {
/*		int[] a = new int[4];  //Forma 1
		a[0]=9;
		a[1]=12;
		a[2]=18;
		a[3]=27;
*/
		int[] a = {9, 12, 18, 27};  //Forma 2
		
//		Metodos.imprimir(a); //ej0
//		System.out.println("El maximo elemento es: "+Metodos.maximo(a));  //ej1
		System.out.println("El promedio es: "+Metodos.promedio(a));  //ej2
	}
}
