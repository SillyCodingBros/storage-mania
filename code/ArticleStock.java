//package Donnee ;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ArticleStock implements Article
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public int inbound = 0;

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
	public ArticleStock(){
		super();
	}

	public String toSTring(){
		String str = new String();
		str = Article.name + " : \n" + Integer.toString(Article.quantity) + "(" +
			Integer.toString(this.inbound) + ")   " + Integer.toString(this.barcode) +
			Integer.toString(Article.price) + " €\n";

		return str;
	}
}

