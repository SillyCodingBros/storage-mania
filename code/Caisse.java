//package Caissier ;
import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Caisse
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	private boolean tiroirState = false;
	private Transaction currentTransaction = new Transaction();
	private ArrayList<Transaction> listeTransaction = new ArrayList<Transaction>();
	private Stock stock = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Caisse(Stock stock){
		this.stock = stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void ScanCodeB(int codeBar) {
		ArticleStock article = stock.getArticleFromCodeBar(codeBar);
		if (article == null) {
			System.out.println("wrong barcode");
			return;
		}
		currentTransaction.addArticle(article.name,article.price);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void TiroirOuvert() {
		System.out.println("tiroir ouvert");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void TiroirFermer() {
		System.out.println("tiroir fermer");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void Retour() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void GetSolde() {
		System.out.println("solde");
		for (Transaction transaction: listeTransaction) {
			System.out.println(transaction.toString());
		}
	}

}

