/*
 * Calcular el area de poligonos (Triangulo y Rectangulo)
 * Almacenar en un arraylist N triangulos y rectangulos
 * Mostrar el area y datos de cada uno
 * 
 * Usar Herencia, Polimorfismo, Abstraccion y Encapsulacion.
 */


package CalcularAreaPoligonos;

public abstract class Poligonos {

	protected int numeroLados;

	public Poligonos(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	@Override
	public String toString() {
		return "Poligonos [numeroLados=" + numeroLados + "]";
	}
	
	//Metodo abstract
	public abstract double calcularArea();
}
