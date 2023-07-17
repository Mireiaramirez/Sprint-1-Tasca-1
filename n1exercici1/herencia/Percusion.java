package herencia;

public class Percusion extends Instrumento {

	public Percusion(String nombre, int precio) {
		super(nombre, precio);
	}

	public void tocarInstrumento() {
		System.out.println("Está sonando un instrumento de percusión.");
	}
}
