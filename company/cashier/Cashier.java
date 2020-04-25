package company.cashier;

import java.util.ArrayList;

import company.data.StockProduct;
import company.data.Stock;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Cashier
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	private boolean drawerState;
	private SalesOrder currentSale;
	private ArrayList<SalesOrder> salesOrderList;
	private Stock stock;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Cashier(Stock stock){
		this.stock = stock;
		drawerState = false;
		currentSale = new SalesOrder();
		salesOrderList = new ArrayList<SalesOrder>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void scanBarcode(int barcode) {
		StockProduct product = stock.getProductFromBarcode(barcode);
		if (product == null) {
			System.out.println("wrong barcode");
			return;
		}
		currentSale.addProduct(product.name, product.price);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void openDrawer() {
		System.out.println("tiroir ouvert");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void closedDrawer() {
		System.out.println("tiroir fermé");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void productReturn() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void getBalance() {
		System.out.println("solde");
		for (SalesOrder sales: salesOrderList) {
			System.out.println(sales.toString());
		}
	}

}

