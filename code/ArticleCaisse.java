//package donnee;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ArticleCaisse implements Article
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ArticleCaisse(){
		super();
	}

	public String toSTring(){
		String str = new String();
		str = this.name + " : \n" + Integer.toString(this.quantity) + "\t" + Integer.toString(this.price) + " €\n";

		return str;
	}
}

