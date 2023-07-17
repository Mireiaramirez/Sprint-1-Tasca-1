package Cotxe;

public class Cotxe {

	private static final String marca = "Ford";
	private static String model;
	private final int potencia = 74;

	// Modelo es el único atributo que se puede inicializar en el constructor,
	// marca y potencia son final y ya están inicializados

	public Cotxe(String model) {
		this.model = model;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}

	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

}
