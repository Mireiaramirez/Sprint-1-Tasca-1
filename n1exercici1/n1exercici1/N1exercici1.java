package n1exercici1;

import herencia.Viento;
import herencia.Cuerda;
import herencia.Percusion;

public class N1exercici1 {

	public static void main(String[] args) {

		Viento clarinete = new Viento("Clarinete", 52);
		Cuerda violin = new Cuerda("Violín", 70);
		Percusion tambor = new Percusion("Tambor", 50);

		clarinete.tocarInstrumento();
		violin.tocarInstrumento();
		tambor.tocarInstrumento();
		System.out.println(clarinete.toString());

	}

}
