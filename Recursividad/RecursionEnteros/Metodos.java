package RecursionEnteros;

public class Metodos {

	static int sumaDesdeUnoHasta(int n) {  //ej1
		if(n == 0) {
			return 0;
		}
		return n + sumaDesdeUnoHasta(n-1);
	}
	
	static void imprimirDesde(int n) {  //ej3
		if(n==0) {
			System.out.println(n);
			return;
		}
		else {
			System.out.println(n);
			imprimirDesde(n-1);
		}
			
	}
	
	
	
	static double potencia(double base, int exp) {  //ej5
		if (exp==0) {
			return 1;
		}
		else {
			return base * potencia(base, exp-1);
		}
	}



}
