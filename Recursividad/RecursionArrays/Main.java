package RecursionArrays;

public class Main {

	public static void main(String[] args) {
		int [] a= {20, 4, 6, 5};
		
//		Metodos.imprimir(a);  //ej1
		
		System.out.print("Array original: ");
		Metodos.imprimir(a);
		System.out.print("\nArray actual:");
		System.out.print(Metodos.suma(a));
	}
}
