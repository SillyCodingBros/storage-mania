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
	public CheckoutProduct(String name, int price){
		super();
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}

	public String toString(){
		String str = new String();
		str = this.name + " : \n" + Integer.toString(this.quantity) + "\t" + Integer.toString(this.price) + " €\n";
		return str;
	}
}

