//package Caissier ;
import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Transaction
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	private ArrayList<ArticleStock> ListeArticle = new ArrayList<ArticleStock>();

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Transaction(){
		super();
	}

	public void addArticle(String name, int price, int quantity){
		listeTransaction.add(new ArticleCaisse(name,price,quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public String ToString() {
		// TODO implement me
		String transaction;

		for(int article = 0; i < ListeArticle.size(); i++) {
			transaction += ListeArticle.get(article).toSTring();
		}

		return transaction;
	}

}

