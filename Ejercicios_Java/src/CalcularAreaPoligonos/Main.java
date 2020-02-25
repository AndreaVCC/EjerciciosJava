package CalcularAreaPoligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>();
	static Scanner entrada = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		llenarPoligono();
	}

	public static void llenarPoligono () {
		int opcion;
		char opcion2;

		do {
			
			do {	
				//Esto se repite 
				System.out.println("Digite que poligono desea");
				System.err.println("n/1. Tringulo  n/2.Rectangulo");
				System.out.println("Digite opcion");
				opcion = entrada.nextInt();
				
				//mientras el rango elegido sea 1 o 2
			} while (opcion <1 || opcion>2);
		
			switch (opcion) {
			case 1: {
				llenarTriangulo();
				break;
			}
			case 2: {
				llenarRectangulo();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
			System.out.println("¿Desea introducir otro poligono? (s/n)");
			opcion2 = entrada.next().charAt(0);
		
		//se seguira repitiendo mientras la respuesta es s o S
		} while (opcion2 == 's' || opcion2 == 'S');
		

	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		System.out.println("Digite lado 1: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digite lado 2: ");
		lado2 = entrada.nextDouble();
		System.out.println("Digite lado 3: ");
		lado3 = entrada.nextDouble();
		
		//Instancio un objeto de tipo Triangulo
		Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
		
		//Agrego en el Arraylist "poligono" el objeto triangulo
		poligono.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1, lado2;
		System.out.println("Digite lado 1: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digite lado 2: ");
		lado2 = entrada.nextDouble();
			
		//Instancio un objeto de tipo Triangulo
		Rectangulo rectangulo = new Rectangulo (lado1, lado2);
		
		//Agrego en el Arraylist "poligono" el objeto triangulo
		poligono.add(rectangulo);
	}
	
	public static void mostrarResultados () {
		for (Poligonos poligonos : poligono) {
			System.out.println(poligonos.toString());
			System.out.println(poligonos.calcularArea());

		}
	}
}
