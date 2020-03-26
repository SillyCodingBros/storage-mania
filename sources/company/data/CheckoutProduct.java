package company.data;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CheckoutProduct extends Product
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private static final long serialVersionUID = 6l;

	public CheckoutProduct(String name, float price){
		super();
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}

	public String toString(){
		String str = new String();
		str = this.name + " : \n" + Integer.toString(this.quantity) + "\t" + Float.toString(this.price) + " €\n";
		return str;
	}
}

