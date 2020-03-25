package company.data;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StockProduct extends Product
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public int inbound;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public int barcode;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public int threshold;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StockProduct(){
		super();
	}

	public String toSTring(){
		String str = new String();
		str = this.name + " : \n" + Integer.toString(this.quantity) + "(" +
			Integer.toString(this.inbound) + ")   " + Integer.toString(this.barcode) +
			Integer.toString(this.price) + " €\n";

		return str;
	}
}

