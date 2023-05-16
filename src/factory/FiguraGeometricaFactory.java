package factory;

import Product.IFiguraGeometrica;
import Product.Cerchio;
import Product.Quadrato;

/**
 * 
 * @author FLORIOP
 * @description classe factory
 *
 */
public class FiguraGeometricaFactory {

	// in input devono essere passati i parametri necessari per costruire il
	// prodotto
	public static IFiguraGeometrica createFigiuraGeometrica(String type){
        IFiguraGeometrica figura = null;
        if (type.equalsIgnoreCase("C")){
            figura = new Cerchio();
        } else if (type.equalsIgnoreCase("Q")){
            figura = new Quadrato();
        } else {
            System.out.println("Invalid type");
        }
        return figura;
    }
}
