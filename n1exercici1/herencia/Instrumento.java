package herencia;

public abstract class Instrumento {

	protected String nombre;
	protected int precio;

	public Instrumento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public abstract void tocarInstrumento();

}
