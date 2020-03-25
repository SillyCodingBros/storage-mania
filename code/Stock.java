//package Donnée ;
import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Stock
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public ArrayList<ArticleStock> stock;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Stock(){
		stock = new ArrayList<ArticleStock>();
	}

	ArticleStock getArticleFromCodeBar (int codeBar) {
		for (ArticleStock article : stock) {
			if (article.barcode == codeBar){
				return article;
			}
		}
		return null;
	}

}

