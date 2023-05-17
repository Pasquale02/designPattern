package application;

import Product.IFiguraGeometrica;
import builder.Automobile;
import factory.FiguraGeometricaFactory;

public class Main {

	public static void main(String[] args) {

		// factory method
		IFiguraGeometrica figura = FiguraGeometricaFactory.createFigiuraGeometrica("C");
		figura.disegna();

		figura = FiguraGeometricaFactory.createFigiuraGeometrica("Q");
		figura.disegna();

		// builder pattern 

		Automobile automobile = new Automobile.Builder().setMarca("fiat").setModello("panda").setColore("rosso")
				.setCambioAutomatico(false).setNumMarce(5).build();

	}
}
