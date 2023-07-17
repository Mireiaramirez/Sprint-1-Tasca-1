package Cotxe;

public class Main {

	public static void main(String[] args) {

		// Puedo llamar al método frenar directamente con la clase Coche
		Cotxe.frenar();
		// Instancio un objeto Coche de la clase coche para llamar a acelerar
		Cotxe focus = new Cotxe("Focus");
		focus.accelerar();
		// Si imprimo los atributos con los getters compruebo que los atributos finales
		// se inicializan sin estar en el constructor
		System.out.println("La marca del coche es " + focus.getMarca() + " , el modelo es " + focus.getModel()
				+ " y la potencia es de " + focus.getPotencia() + " kW.");

	}

}
