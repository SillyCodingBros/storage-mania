package company.data;

import java.util.ArrayList;
/*
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
*/

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Stock implements java.io.Serializable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public ArrayList<StockProduct> stock;
	private static final long serialVersionUID = 42L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Stock(){
		stock = null;
		if (stock == null) stock = new ArrayList<StockProduct>();
	}

	public StockProduct getProductFromBarcode(int barcode) {
		for (StockProduct product : stock) {
			if (product.barcode == barcode){
				return product;
			}
		}
		return null;
	}

	public void addProduct(StockProduct product){
		stock.add(product);
	}
}

