import company.manager.*;

import java.util.Scanner;
import company.data.Stock;
import company.serial.DeserializeStock;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MainConsole
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainConsole(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void displayStockProducts() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void displayPurchaseOrders() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void printDisplayedData() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void makePurchaseOrder() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void displayBelowThresholds() {
		// TODO implement me
	}

	public static void main(String[] args) {
		Stock stock = new Stock();
		DeserializeStock.main(stock);
		//if (stock == null) stock = new Stock();
		Scanner reader = new Scanner(System.in);
		reader.useDelimiter(" ");
		String input;
		String help = "Avalable commands are : \n\t [e]xit : stops the machine, \n\t [h]elp : displays this message, \n\t"+
						" [s]tock : displays stock state,\n\t [t]hreshold : displays products that may go out of stock soon, \n\t" +
						" addp : add a new product entry, \n\t delp : delete a product entry, \n\t [d]etail : prints full details about a product" ;

		//MVC stockMVC = new MVC("stockMVC"/*, this, new StockModel(), new StockView(), new StockController()*/);
		//MVC productMVC = new MVC("productMVC"/*, this, new ProductModel(), new ProductView(), new ProductController()*/);
		//MVC stockProductMVC = new MVC("stockProductMVC"/*, this, new stockProductModel(), new stockProductView(), new stockProductController()*/);
		AddProductModel addProductModel = new AddProductModel(stock);
		AddProductView addProductView = new AddProductView();
		AddProductController addProductController = new AddProductController(addProductModel, addProductView);

		RemoveProductModel removeProductModel = new RemoveProductModel(stock);
		RemoveProductView removeProductView = new RemoveProductView();
		RemoveProductController removeProductController = new RemoveProductController(removeProductModel, removeProductView);

		ProductDetailModel productDetailModel = new ProductDetailModel(stock);
		ProductDetailView productDetailView = new ProductDetailView();
		ProductDetailController productDetailController = new ProductDetailController(productDetailModel, productDetailView);

		StockModel stockModel = new StockModel(stock);
		StockView stockView = new StockView();
		StockController stockController = new StockController(stockModel, stockView);

		ThresholdModel thresholdModel = new ThresholdModel(stock);
		ThresholdView thresholdView = new ThresholdView();
		ThresholdController thresholdController = new ThresholdController(thresholdModel, thresholdView);

		System.out.println(help);
		while(true){
			System.out.print(">");
			input = reader.nextLine();
			if(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("e")){
				break;
			}
			else if(input.equalsIgnoreCase("help") || input.equalsIgnoreCase("h"))
				System.out.println(help);

			else if(input.equalsIgnoreCase("stock") || input.equalsIgnoreCase("s")){
				stockController.getStockSummury();
			}
			else if(input.equalsIgnoreCase("threshold") || input.equalsIgnoreCase("t"))
				thresholdController.threshold();

			else if(input.equalsIgnoreCase("addp")){
				addProductController.addProduct();
			}
			else if(input.equalsIgnoreCase("delp")){
				removeProductController.removeProduct();
			}
			else if(input.equalsIgnoreCase("detail") || input.equalsIgnoreCase("d")){
				productDetailController.productDetail();
			}
			else{
				System.out.println("Unknown command, type 'help' to see supported commands.");
			}
		}
		reader.close();

	}
}

