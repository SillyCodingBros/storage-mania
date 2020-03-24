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
	public ArticleCaisse(String name, int price, int quantity){
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String toSTring(){
		String str = new String();
		str = Article.name + " : \n" + Integer.toString(Article.quantity) + "\t" + Integer.toString(Article.price) + " €\n";

		return str;
	}
}

