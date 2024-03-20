package funcionesStrings;
import java.util.Scanner;
@SuppressWarnings("resource")

public class EjDeStrings {
	public static void main(String[] args) {
		String algo = "Argentinos";
		String algo2= "Estudiante";
		//int aparece = cantApariciones(algo);
		//System.out.println("la letra 'e' aparece " + aparece + " veces");
		//System.out.println(sonTodasE(algo));
		System.out.println(sonIguales(algo, algo2));
	}
	//ej1
	public static int cantApariciones(String p) {
		int cont = 0;
		p=p.toLowerCase();
		for ( int i= 0; i<p.length(); i ++) {
			if(p.charAt(i)=='e') {
				cont++;
			}
		}
		return cont;
	}
	//ej2
	public static boolean sonTodasE(String s) {
		if (s.length()== cantApariciones(s)) {
				return true;
		}
		else {
			return false;
		}
	}
	public static boolean sonIguales(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		for (int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i)!= s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
}
