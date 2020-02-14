package Enumeracion_enum;

public class mainEnumeracion {

	public static void main(String[] args) {
		System.out.println(Enumeracion.LUNES);
		System.out.println(Enumeracion.MARTES);

		System.out.println(Continentes.AFRICA);
		System.out.println(Continentes.AMERICA.getPaises());

		indicarDia(Continentes.AMERICA);
	}

	private static void indicarDia(Continentes dias) {
		switch (dias) {
		case AMERICA: {
			System.out.println("Tiene " + Continentes.AMERICA.getPaises() + "paises.");
			break;
		}
		default:
			System.out.println("Ingrese otro");
		}
	}


}

