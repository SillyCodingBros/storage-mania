package company.data;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.StringBuilder;
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
	public Set<Integer> barcodeSet;
	private static final long serialVersionUID = 42L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Stock(){
		stock = new ArrayList<StockProduct>();
		barcodeSet = new HashSet<>();
	}

	public StockProduct getProductFromBarcode(int barcode) {
		for (StockProduct product : stock) {
			if (product.barcode == barcode){
				return product;
			}
		}
		return null;
	}

	public boolean addProduct(StockProduct product){
		if (!barcodeSet.add(product.barcode)) return false;
		stock.add(product);
		return true;
	}

	public boolean removeProduct(int barcode){
		for (StockProduct product : stock) {
			if (product.barcode == barcode){
				barcodeSet.remove(barcode);
				return stock.remove(product);
			}
		}
		return false;
	}

	public String toString(){
		if (stock.isEmpty()) return "Stock is Empty\n";
		StringBuilder sb = new StringBuilder("Name   Qty Owned(inb.)/lim.\tBarcode\t\tPrice\n");
		for (StockProduct product : stock) {
			sb.append(product.toString());
		}
		return sb.toString();
	}

	public String belowThresholdToString(){
		if (stock.isEmpty()) return "Stock is Empty\n";
		StringBuilder sb = new StringBuilder("");
		for (StockProduct product : stock) {
			if (product.quantity <= product.threshold) sb.append(product.toString());
		}
		if (sb.toString().equals("")) return "No Products Bellow Threshold\n";
		return "Name   Qty Owned(inb.)/lim.\tBarcode\t\tPrice\n" + sb.toString();
	}

	public Stock belowThresholdStock(){
		Stock thresh = new Stock();
		for(StockProduct product : stock){
			if(product.quantity <= product.threshold) thresh.addProduct(product);
		}
		return thresh;
	}
}

