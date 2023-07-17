package herencia;

public class Viento extends Instrumento {

	// He introducido este static initialization block para demostrar que la carga
	// de la clase se puede
	// realizar por un elemento estático o por la creación de una primera instancia
	// de la clase

	static {
		String nombre = "Flauta";
		int precio = 52;
		System.out.println("El instrumento se llama " + nombre + " y su precio es " + precio);

	}

	public Viento(String nombre, int precio) {
		super(nombre, precio);

	}

	public void tocarInstrumento() {

		System.out.println("Está sonando un instrumento de viento.");

	}

	public String toString() {
		return ("El instrumento se llama " + nombre + "  y su precio es " + precio);

	}

}
