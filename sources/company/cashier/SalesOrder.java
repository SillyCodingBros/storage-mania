package company.cashier;

import java.util.ArrayList;
import java.lang.StringBuilder;

import company.data.CheckoutProduct;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class SalesOrder
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	private ArrayList<CheckoutProduct> salesOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SalesOrder(){
		salesOrder = new ArrayList<CheckoutProduct>();
	}

	public void addProduct(String name, int price){
		for (CheckoutProduct orderedProduct : salesOrder) {
        if (orderedProduct.name.equals(name)) {
						orderedProduct.quantity++;
            return;
        }
    }
		salesOrder.add(new CheckoutProduct(name, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public String toString(){
		StringBuilder sb = new StringBuilder("");
		for (CheckoutProduct product: salesOrder) {
			sb.append(product.toString());
		}
		return sb.toString();
	}

}

