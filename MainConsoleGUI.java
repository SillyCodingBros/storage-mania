import company.manager_gui.*;

import java.awt.*;
import java.applet.Applet;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JFrame;
import company.data.Stock;
import company.serial.DeserializeStock;

public class MainConsoleGUI
{
	public MainConsoleGUI(){
		super();
	}

	public static void main(String[] args) {
		Stock stock = new Stock();
		DeserializeStock.main(stock);

		HashMap <String, Object> context = new HashMap<String, Object>();

		JFrame window = new JFrame();
		window.setTitle("Storage Mania");
		window.setSize(1200,800);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//if (stock == null) stock = new Stock();
		/*Scanner reader = new Scanner(System.in);
		reader.useDelimiter(" ");
		String input;
		String help = "Avalable commands are : \n\t [e]xit : stops the machine, \n\t [h]elp : displays this message, \n\t"+
						" [s]tock : displays stock state,\n\t [t]hreshold : displays products that may go out of stock soon, \n\t" +
						" addp : add a new product entry, \n\t delp : delete a product entry, \n\t [d]etail : prints full details about a product" ;
		*/
		//MVC stockMVC = new MVC("stockMVC"/*, this, new StockModel(), new StockView(), new StockController()*/);
		//MVC productMVC = new MVC("productMVC"/*, this, new ProductModel(), new ProductView(), new ProductController()*/);
		//MVC stockProductMVC = new MVC("stockProductMVC"/*, this, new stockProductModel(), new stockProductView(), new stockProductController()*/);

		AddProductModel addProductModel = new AddProductModel(stock);
		AddProductView addProductView = new AddProductView(window);
		context.put("addProduct", addProductView);

		RemoveProductModel removeProductModel = new RemoveProductModel(stock);
		RemoveProductView removeProductView = new RemoveProductView(window);
		context.put("removeProduct", removeProductView);

		ProductDetailModel productDetailModel = new ProductDetailModel(stock);
		ProductDetailView productDetailView = new ProductDetailView(window);
		context.put("productDetail", productDetailView);

		StockModel stockModel = new StockModel(stock);
		StockView stockView = new StockView(window);
		context.put("stock", stockView);

		ThresholdModel thresholdModel = new ThresholdModel(stock);
		ThresholdView thresholdView = new ThresholdView(window);
		context.put("threshold", thresholdView);

		AddProductController addProductController = new AddProductController(addProductModel, addProductView, context);
		addProductView.setController(addProductController);
		RemoveProductController removeProductController = new RemoveProductController(removeProductModel, removeProductView, context);
		removeProductView.setController(removeProductController);
		ProductDetailController productDetailController = new ProductDetailController(productDetailModel, productDetailView, context);
		productDetailView.setController(productDetailController);
		StockController stockController = new StockController(stockModel, stockView, context);
		stockView.setController(stockController);
		ThresholdController thresholdController = new ThresholdController(thresholdModel, thresholdView, context);
		thresholdView.setController(thresholdController);



		/*System.out.println(help);
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
		reader.close();*/

	}
}

