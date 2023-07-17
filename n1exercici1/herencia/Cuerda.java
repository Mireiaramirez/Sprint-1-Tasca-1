package herencia;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
	}

	public void tocarInstrumento() {
		System.out.println("Está sonando un instrumento de cuerda.");
	}

}
