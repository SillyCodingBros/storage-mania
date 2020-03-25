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

	private ArrayList<ArticleCaisse> ListeArticle = new ArrayList<ArticleCaisse>();

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Transaction(){
		super();
	}

	public void addArticle(String name, int price){
		for (ArticleCaisse article : ListeArticle) {
        if (article.name.equals(name)) {
						article.quantity++;
            return;
        }
    }
		ListeArticle.add(new ArticleCaisse(name,price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public String ToString() {
		String transaction = "";

		for (ArticleCaisse article: ListeArticle) {
			transaction += article.toSTring();
		}

		return transaction;
	}

}

