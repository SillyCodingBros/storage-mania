package company.data;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StockProduct extends Product implements java.io.Serializable
{

	private static final long serialVersionUID = 21L;

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

	public String toString(){
		String str = new String();
		str = this.name + " : \n" + Integer.toString(this.quantity) + "(" +
			Integer.toString(this.inbound) + ")   " + Integer.toString(this.barcode) +
			Float.toString(this.price) + " €\n";

		return str;
	}
}

