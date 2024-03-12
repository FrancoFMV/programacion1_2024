package practica0;
import java.util.Scanner;

@SuppressWarnings("resource")  //Esto lo que hace es eliminar el "warning" de no tener cerrado el Scaner en los metodos que lo utilicen
public class practica0 {  
    public static void ejercicio1() {  //Hola Mundo
        System.out.println("¡Hola Mundo!");
    }

      
    public static void ejercicio2(){  //Hola Mundo personalizado
        Scanner nombreSc = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = nombreSc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

    
    public static void ejercicio3(){  //Sumar 2 nums
        Scanner numSc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int num1 = numSc.nextInt();
        System.out.println("+");
        System.out.print("Segundo numero: ");
        int num2 = numSc.nextInt();
        System.out.println("Resultado: " +  (num1 + num2));
    }

    public static void ejercicio4(){  //Interpretar valor
        System.out.println(1/2 + " = 1/2 = int"); //int
        System.out.println(1.0/2.0 + " = 1.0/2.0 = double");  //double
        System.out.println(1.0/2 + " = 1.0/2 = double");  //double
        System.out.println("'1'/'2' = ERROR"); //!Error
        System.out.println(1+2 + " = 1+2 = int");  //int
        System.out.println("1"+"2" + " = \"1\"+\"2\" = Concatenación");  //Concatenación
        System.out.println(16/2*4 + " = 16/2*4 = int");  //int
        System.out.println(16/(2*4) + " = 16/(2*4) = int");  //int
    }

    
    public static void ejercicio5(){  //Promedio de 2 nums
        Scanner numSc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        double n1 = numSc.nextDouble();
        System.out.print("Segundo numero: ");
        double n2 = numSc.nextDouble();
        double promedio = (n1 + n2)/2;
        System.out.println("El promedio es de " +  promedio);
    }

    
    public static void ejercicio6(){  //Suma con metodo
        Scanner numSc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = numSc.nextInt();
        System.out.print("num2: ");
        int num2 = numSc.nextInt();
        System.out.println(num1+num2 +"="+ imprimirSuma(num1, num2));
    }
    public static int imprimirSuma(int a, int b){  //Parte del ej6
        return  a + b;
    }

    
    public static void ejercicio7(){  //Promedio con metodo
        Scanner numSc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = numSc.nextInt();
        System.out.print("num2: ");
        int num2 = numSc.nextInt();
        System.out.println("El promedio es de " + imprimirPromedio(num1, num2));
    }
    public static double imprimirPromedio(double x, double y) {  //Parte del ej7
        double promedio = (x + y)/2;
        return promedio;
    }  

    public static void ejercicio8(){  //poner nota
        Scanner numSc = new Scanner(System.in);
        System.out.print("num1: ");
        double num1 = numSc.nextFloat();
        System.out.print("num2: ");
        double num2 = numSc.nextFloat();
        double resultado = imprimirPromedio(num1, num2);
        if(resultado>11){
            System.out.println("Las notas no son mayores a 10");
        }
        else if(resultado>=7.0){
            System.out.println(resultado+" Promocionado");
        }
        else if(resultado>=4.0){
            System.out.println(resultado+" Aprobado");
        }
        else{
            System.out.println(resultado+" Debe recuperar");
        }
    }

    public static void ejercicio9(){ //Fecha
        Scanner fechaSc = new Scanner(System.in);
        System.out.println("Ingrese la fecha deseada en formato dd/mm/aaaa");
        System.out.print("dia: ");
        int dia = fechaSc.nextInt();
        System.out.print("mes: ");
        int mes = fechaSc.nextInt();
        System.out.print("año: ");
        int anio = fechaSc.nextInt();
        imprimirFecha(dia, mes, anio);
    }
    public static void imprimirFecha(int dia, int mes, int anio) {
        String nombreMes;
        
        // Verificar si el mes es válido
        if (mes >= 1 && mes <= 12) {
            // Verificar si el día es válido para el mes
            if (dia >= 1 && dia <= obtenerDiasMes(mes, anio)) {
                // Obtener el nombre del mes
                switch (mes) {
                    case 1: nombreMes = "Enero"; break;
                    case 2: nombreMes = "Febrero"; break;
                    case 3: nombreMes = "Marzo"; break;
                    case 4: nombreMes = "Abril"; break;
                    case 5: nombreMes = "Mayo"; break;
                    case 6: nombreMes = "Junio"; break;
                    case 7: nombreMes = "Julio"; break;
                    case 8: nombreMes = "Agosto"; break;
                    case 9: nombreMes = "Septiembre"; break;
                    case 10: nombreMes = "Octubre"; break;
                    case 11: nombreMes = "Noviembre"; break;
                    case 12: nombreMes = "Diciembre"; break;
                    default: nombreMes = "Mes inválido"; break;
                }
                
                // Imprimir la fecha en el formato especificado
                System.out.println(dia + " de " + nombreMes + " de " + anio);
            } else {
                System.out.println("Fecha inválida: el día no es válido para el mes especificado.");
            }
        } else {
            System.out.println("Fecha inválida: el mes no es válido.");
        }
    }
    // Método para obtener la cantidad de días en un mes, considerando los años bisiestos
    public static int obtenerDiasMes(int mes, int anio) {
        switch (mes) {
            case 2:
                if (esAnioBisiesto(anio)) {
                    return 29; // Febrero en año bisiesto tiene 29 días
                } else {
                    return 28; // Febrero en año no bisiesto tiene 28 días
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30; // Abril, Junio, Septiembre y Noviembre tienen 30 días
            default:
                return 31; // Los demás meses tienen 31 días
        }
    }
    // Método para verificar si un año es bisiesto
    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void ejercicio9_altern(){
        Scanner fechaSc = new Scanner(System.in);
        System.out.println("Ingrese la fecha deseada en formato dd/mm/aaaa");
        System.out.print("dia: ");
        int dia = fechaSc.nextInt();
        System.out.print("mes: ");
        int mes = fechaSc.nextInt();
        System.out.print("año: ");
        int anio = fechaSc.nextInt();
        imprimirFecha_altern(dia, mes, anio);
    }
    public static void imprimirFecha_altern(int dia, int mes, int anio) {
        // Nombres de los meses
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Cantidad de días en cada mes (índices de 0 a 11)
        int[] diasPorMes = {
            31, esBisiesto(anio) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Verificar si el día y el mes son válidos
        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasPorMes[mes - 1]) {
            System.out.printf("%d de %s de %d\n", dia, nombresMeses[mes - 1], anio);
        } else {
            System.out.println("Fecha inválida");
        }
    }
    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void ejercicio10(){
        Scanner numSc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = numSc.nextInt();
        sumatoria(num);
    }
    public static int sumatoria(int n){
        int suma=0;
        for(int i=1; i<=n;i++){
            suma+=i;
            System.out.println(suma);
        }
        return suma;
    }

    public static void ejercicio11(){
        Scanner numSc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = numSc.nextInt();
        sumatoriaPares(num);
    }
    public static int sumatoriaPares(int n){
        int suma=0;
        for(int i=1; i<=n;i++){
            if (i%2==0){
                suma+=i;
                System.out.println("i "+i);
                System.out.println("suma "+ suma);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio9_altern();
        // ejercicio10();
        ejercicio11();
    }
}
