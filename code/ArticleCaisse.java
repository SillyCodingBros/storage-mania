package Donnee ;


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
		StringBuilder sb = new StringBuilder("");
		sb.append(Article.Name);
		sb.append( " : ");
		sb.append(Article.Quantity);
		sb.append(" (");
		sb.append(Article.inbound);

	}
}

