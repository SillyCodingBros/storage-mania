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
		str = Article.name + " : \n" + Integer.toString(Article.quantity) + "\t" + Integer.toString(Article.price) + " €\n";

		return str;
	}
}

