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

