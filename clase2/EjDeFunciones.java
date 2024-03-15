package clase2;
import java.util.Random;
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

	
	public static void ej5(){
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese su número y veamos cuantos digitos tiene: ");
		int num = numSc.nextInt();
		System.out.println("Tiene "+cantDigitos(num)+" digitos");
	}
	public static int cantDigitos(int n){
		int digitos = 0;
		while (n != 0) {
			n = n / 10;
			digitos++;
		}
		return digitos;
	}
	
	public static void ej5_altern(){
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese su número y veamos cuantos digitos tiene: ");
		int num = numSc.nextInt();
		System.out.println("Tiene "+contarDigitos(num)+" digitos");
	}
	public static int contarDigitos(int numero) {
        // Convertir el número a una cadena de caracteres
        String numeroComoString = String.valueOf(numero);
        // Obtener la longitud de la cadena, que es igual a la cantidad de dígitos
        return numeroComoString.length();
    }

	public static void ej6(){
		Scanner numSc = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		int num1 = numSc.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int num2 = numSc.nextInt();
		System.out.println("Tienen "+divisoresComun(num1, num2)+" divisores en común");
	}
	public static int divisoresComun(int a, int b){
		int cont=0;
		for(int i =1;i<=a;i++){
			if(b%i==0 && a%i==0 )
				cont++;
		}
		return cont;
	}

	public static void ej7(){
        Scanner scanner = new Scanner(System.in);
        int numeroPensado = pensarNumero();
        int intentos = 0;

        System.out.println("Adivina el número que estoy pensando (entre 1 y 10)");

        while (intentos < 3) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int intento = scanner.nextInt();
            
            if (intento == numeroPensado) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                return;
            } else {
                System.out.println("¡Incorrecto! Sigue intentando.");
            }
            
            intentos++;
        }

        System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroPensado);
    }

    public static int pensarNumero() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

	public static void main(String[] args) {
		// ej1();
		// ej2();
		// ej3();
		// ej4();
		// ej5();
		// ej5_altern();
		// ej6();
		ej7();
	}

}
