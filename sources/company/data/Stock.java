package company.data;

import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Stock
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public ArrayList<StockProduct> stock;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Stock(){
		stock = new ArrayList<StockProduct>();
	}

	public StockProduct getProductFromBarcode(int barcode) {
		for (StockProduct product : stock) {
			if (product.barcode == barcode){
				return product;
			}
		}
		return null;
	}

}

