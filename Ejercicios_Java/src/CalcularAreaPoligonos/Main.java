package CalcularAreaPoligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		llenarPoligono();
		mostrarResultados();
	}

	// Metodos static para que los reconozca metodo main
	public static void llenarPoligono() {
		int opcion;
		char opcion2;

		do {

			do {
				// Esto se repite
				System.out.println("¿Qué poligono desea agregar?");
				System.out.println("\n1. Tringulo  \n2. Rectangulo");
				System.out.println("");
				System.out.println("Digite opcion:");
				opcion = entrada.nextInt();

			// mientras  que el rango del numero ingresado sea menor a 1 y mayor a 2
			} while (opcion < 1 || opcion > 2);

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

			// se seguira repitiendo mientras la respuesta es s o S
		} while (opcion2 == 's' || opcion2 == 'S');
	}

	/*
	 * La clase Poligonos no se puede instanciar ya que es abstracta, asi que se
	 * Instancian sus clases hijas Triangulo y Rectangulo.
	 */

	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		System.out.println("Digite lado 1: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digite lado 2: ");
		lado2 = entrada.nextDouble();
		System.out.println("Digite lado 3: ");
		lado3 = entrada.nextDouble();

		// Instancio un objeto de tipo Triangulo
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// Agrego en el Arraylist "poligono" el objeto triangulo
		poligono.add(triangulo);
	}

	public static void llenarRectangulo() {
		double lado1, lado2;
		System.out.println("Digite lado 1: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digite lado 2: ");
		lado2 = entrada.nextDouble();

		// Instancio un objeto de tipo Rectangulo
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);

		// Agrego en el Arraylist "poligono" el objeto triangulo
		poligono.add(rectangulo);
	}

	public static void mostrarResultados() {
		for (Poligonos poligonos : poligono) {
			System.out.println(poligonos.toString());
			System.out.println("El Area es: " + poligonos.calcularArea());
			System.out.println("");

		}
	}
}
