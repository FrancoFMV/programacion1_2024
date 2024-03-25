package RecursionStrings;

public class Metodos {
	
	public static String resto(String s) {
		String resultado= "";
		for(int i = 1; i < s.length();i++ ) {
			resultado = resultado + s.charAt(i);
		}
		return resultado;
	}
	
	public static void imprimirEspaciado(String s) {
		if(s.length()== 1){
			System.out.print(s);
			return;
		}
		else {
			System.out.print(s.charAt(0) + " ");
			imprimirEspaciado(resto(s));
		}
	}
	
	public static String reverso(String s) {
		if (s.isEmpty()) {
			return s;
		}
		return reverso(s.substring(1))+s.charAt(0);
	}
	
	
}
