package application;

import Product.IFiguraGeometrica;
import factory.FiguraGeometricaFactory;

public class Main {

	public static void main(String[] args) {
		
        IFiguraGeometrica figura = FiguraGeometricaFactory.createFigiuraGeometrica("C");
        figura.disegna();
        
        figura = FiguraGeometricaFactory.createFigiuraGeometrica("Q");
        figura.disegna();

	}
}
