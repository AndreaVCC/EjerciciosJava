package Enumeracion_enum;

public enum Continentes {
	
	AFRICA(54),
	EUROPA(23),
	ASIA(43),
	AMERICA(15),
	OCEANIA(12);
	
	//Definir Atributo paises de la enumeracion
	private final int paises;
	
	//Constructor
	Continentes (int paises) {
		this.paises = paises;
	}

	//Metodo para mostrar
	public int getPaises() {
		return this.paises;
	}
	
	
	
}
