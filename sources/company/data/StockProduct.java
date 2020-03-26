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

	public String toString(){
		String str = new String();
		str = this.name + " : \t" + Integer.toString(this.quantity) + "(" +
			Integer.toString(this.inbound) + ")" + " / " + Integer.toString(this.threshold) + "\t"+
			Integer.toString(this.barcode) + "\t   " +	Float.toString(this.price) + " €\n";

		return str;
	}
}

