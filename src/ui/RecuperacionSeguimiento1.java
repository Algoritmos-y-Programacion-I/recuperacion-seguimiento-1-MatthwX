package ui;

import java.util.Scanner;

public class RecuperacionSeguimiento1 {

    private Scanner escaner;

    //Constantes para representar los posibles resultados
    private static final int TODOS_IGUALES = 3;
    private static final int DOS_IGUALES = 2;
    private static final int NINGUNO_IGUAL = 0;

    //Constantes punto 3
    String str1;
    String str2;
    String str3;
    String contarCadenasLargas;
	
	//Constantes punto 4
	String Cadena1;
	String Cadena2;
	String CompararPosicion;



    public static void main(String[] args) {
        RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
        mainApp.run();
        System.out.print("\n");
        //mainApp.punto2();
		System.out.print("\n");
        //mainApp.punto3();
		System.out.print("\n");
		//mainApp.punto4();
		System.out.print("\n");
		//mainApp.punto5();
    }

    public RecuperacionSeguimiento1() {
        escaner = new Scanner(System.in);
    }

    public void run() {
        //Pedir números al usuario
        System.out.print("Escribe el primer número: ");
        int a = escaner.nextInt();
        
        System.out.print("Escribe el segundo número: ");
        int b = escaner.nextInt();
        
        System.out.print("Escribe el tercer número: ");
        int c = escaner.nextInt();
        escaner.nextLine();


        //Calcular y mostrar el resultado
        int resultado = contarIguales(a, b, c);
        System.out.println("Cantidad de números iguales: " + resultado);
    }

    //Método para contar cuántos números son iguales
    public static int contarIguales(int a, int b, int c) {
        if (a == b && b == c) {
            return TODOS_IGUALES;
        } else if (a == b || a == c || b == c) {
            return DOS_IGUALES;
        } else {
            return NINGUNO_IGUAL;
        }
    }

    public void punto2() {
        //Pedir datos al usuario
        String nombre;
        int opcion;
        System.out.println("Como te llamas?");
        nombre = escaner.nextLine();

        System.out.println("Elije 1 o 0");
        opcion = escaner.nextInt();
        
        //Calculo de salidas mediante metodos 
        if (opcion == 1) {
            System.out.println("Hola, " + nombre);
        } else if (opcion == 0) {
            System.out.println("Chao, " + nombre);
        } else {
            System.out.println("Error, entradas inválidas");
        }
    }

    public void punto3() {
        escaner = new Scanner(System.in);
        //Pedir datos al usuario
        System.out.print("Escribe la primera palabra: ");
        String str1 = escaner.nextLine();
        
        System.out.print("Escribe la segunda palabra: ");
        String str2 = escaner.nextLine();
        
        System.out.print("Escribe la tercera palabra: ");
        String str3 = escaner.nextLine();

        //Calcular cuántas cumplen con la condición
        int resultado = contarCadenasLargas(str1, str2, str3);

        //Mostrar el resultado
        if (resultado == 3) {
            System.out.println("Las tres palabras tienen 4 o más caracteres");
        } else if (resultado == 2) {
            System.out.println("Solo dos palabras tienen 4 o más caracteres");
        } else if (resultado == 1) {
            System.out.println("Solo una palabra tiene 4 o más caracteres");
        } else {
            System.out.println("Ninguna palabra tiene 4 o más caracteres");
        }

        escaner.close();
        }
        //Metodo para contar las cadenas
        int contarCadenasLargas(String str1, String str2, String str3) {
        int contador = 0;
        if (str1.length() >= 4) contador++;
        if (str2.length() >= 4) contador++;
        if (str3.length() >= 4) contador++;
        
        return contador;
    }

	public void punto4() {
		escaner = new Scanner(System.in);
        //Pedir números al usuario
        System.out.print("Escribe una palabra: ");
        String Cadena1 = escaner.nextLine();

		System.out.print("Escribe otra palabra: ");
        String Cadena2 = escaner.nextLine();

		if (Cadena1.length() >= 3 && Cadena2.length() >= 3){
			boolean resultado = compararPosicion(Cadena1, Cadena2);
			if(resultado) {
				System.out.print("Los caracteres en la posición 2 de ambas cadenas son IGUALES.");
			} else{
				System.out.print("Los caracteres en la posición 2 de ambas cadenas son DIFERENTES.");
			}
		} else{
			System.out.println("No se puede comparar las cadenas");
		}

		
	}

	public boolean compararPosicion(String c1, String c2){
		if (c1.charAt(2) == c2.charAt(2)) return true;
		else return false;
	}

	public void punto5() {
		escaner = new Scanner(System.in);

		System.out.println("Raices de una ecuación cuadrática:");
        double [] variables = new double[3];
        for (int i = 0; i <=2; i++) {
            System.out.println("Ingrese un dato " + (i+1));
            variables[i] = escaner.nextDouble();
        }
        String ecuacion_pos, ecuacion_neg;
        double x1 , x2, a,b,c;
        a = variables[0];
        b = variables[1];
        c = variables[2];
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 *a *c)))/2*a;
        x2 =(-b - Math.sqrt(Math.pow(b, 2) - (4 *a *c)))/2*a;

        ecuacion_pos = "el resultado de la suma en ecuacion cuadratica es " + x1;
        ecuacion_neg = "el resultado de la resta en ecuacion cuadratica es " + x2;

        System.out.println(ecuacion_pos);
        System.out.println(ecuacion_neg);

		
	}
	}