package Enumeracion_enum;

public class mainEnumeracion {

	public static void main(String[] args) {
		System.out.println(Enumeracion.LUNES);
		System.out.println(Enumeracion.MARTES);

		System.out.println(Continentes.AFRICA);
		System.out.println(Continentes.AMERICA.getPaises());

		//llamando al metodo 
		Continentes.indicarDia(Continentes.AMERICA);
		
		//recorrer constantes y convertirlo en array
		for (Continentes continentes : Continentes.values()) {
			System.out.println(continentes);
		}
	}


	}


