package application;

import Product.IFiguraGeometrica;
import builder.Automobile;
import factory.FiguraGeometricaFactory;
import singleton.Singleton;

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
		
		//singleton class
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s == s2) {
			System.out.println("le istanze sono identiche");
		}

	}
}
