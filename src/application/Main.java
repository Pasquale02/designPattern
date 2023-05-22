package application;

import java.io.IOException;
import java.io.InputStreamReader;

import Product.IFiguraGeometrica;
import builder.Automobile;
import factory.FiguraGeometricaFactory;
import singleton.Singleton;
import state.Chain;

public class Main {

	public static void main(String[] args) throws IOException {

		// factory method
		IFiguraGeometrica figura = FiguraGeometricaFactory.createFigiuraGeometrica("C");
		figura.disegna();

		figura = FiguraGeometricaFactory.createFigiuraGeometrica("Q");
		figura.disegna();

		// builder pattern
		Automobile automobile = new Automobile.Builder().setMarca("fiat").setModello("panda").setColore("rosso")
				.setCambioAutomatico(false).setNumMarce(5).build();

		// singleton class
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if (s == s2) {
			System.out.println("le istanze sono identiche");
		}

		// state pattern
		InputStreamReader is = new InputStreamReader(System.in);
		Chain chain = new Chain();
		while (true) {
			System.out.print("Press 'Enter'");
			is.read();
			chain.pull();
		}

	}
}
