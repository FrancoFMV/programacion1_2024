package clase2;
import java.util.Scanner;
@SuppressWarnings("resource")

public class EjDeFunciones {
	public static void ej1() {
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese su número y veamos cuantos divisores tiene: ");
		int num = numSc.nextInt();
		System.out.println("Tiene "+cantDivisores(num)+" divisores");
		
	}
	public static int cantDivisores(int n) {
		int cont=0;
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				cont++;
			}
		}
		return cont;
	}	
		
	public static void ej2() {
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese su número y veamos si es primo: ");
		int num = numSc.nextInt();
		System.out.println(esPrimo(num));	
	}
	public static boolean esPrimo(int n) {
		return cantDivisores(n)==2;
	}
	
	public static void ej3() {
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese su número y veamos el sig num primo: ");
		int num = numSc.nextInt();
		System.out.println("El sig num primo es: "+ sigPrimo(num));	
		
	}
	public static int sigPrimo(int n) {
		int p= n+1;
		while(!esPrimo(p)) {
			p++;
		}
		return p;
	}
	
	public static void ej4(){
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese su número y veamos su factorial: ");
		int num = numSc.nextInt();
		System.out.println("El resultado es: "+factorial(num));
	}
	public static int factorial(int n){
		int result=1;
		for(int i=1; i<=n; i++){
			result*=i;
			// System.out.println(i);
		}

		return result;
	}

	public static void main(String[] args) {
		// ej1();
		// ej2();
		// ej3();
		ej4();
	}

}
