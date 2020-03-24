package Caissier ;


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

	private ArticleStock[] ListeArticle;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Transaction(){
		super();
	}

	public void addArticle(String name, int price, int quantity){
		
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

		for(int article = 0; i < ListeArticle.length; i++) {
			transaction += ListeArticle[article].toSTring();
		}

		return transaction;
	}

}

