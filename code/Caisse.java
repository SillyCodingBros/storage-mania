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
	private ArrayList<Transaction> listeTransaction = new ArrayList<Transaction>();
	private Stock stock;

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
		ArticleStock = stock.getFromCodeBar(codeBar);

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
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void GetSolde() {
		for (int transaction = 0; transaction < listeTransaction.size(); transaction++) {
			System.out.println(listeTransaction.get(transaction).toSTring());
		}
	}

}

