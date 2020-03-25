//package donnee;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ArticleCaisse extends Article
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ArticleCaisse(String name, int price){
		super();
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}

	public String toSTring(){
		String str = new String();
		str = this.name + " : \n" + Integer.toString(this.quantity) + "\t" + Integer.toString(this.price) + " €\n";
		return str;
	}
}

