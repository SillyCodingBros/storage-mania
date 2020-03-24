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

		sb.append(this.name);
		sb.append( " : ");
		sb.append(this.quantity);
		sb.append("\t");
		sb.append(this.price);
		sb.append("€");

		return sb.toString();		
	}
}

