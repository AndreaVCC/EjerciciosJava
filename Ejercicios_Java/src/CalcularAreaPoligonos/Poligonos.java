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
	
	public abstract double calcularArea();
}
