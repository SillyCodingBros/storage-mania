package company.manager_gui;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;
import company.serial.SerializeStock;
import java.util.HashMap;


public class AddProductController {

    private AddProductModel model;
    private AddProductView view;
    private HashMap<String, Object> context;

    public AddProductController(AddProductModel model, AddProductView view, HashMap<String, Object> context){
        this.model = model;
        this.view = view;
        this.context = context;
    }

    public void addProduct(){
        StockProduct newProduct = new StockProduct();
        
        String name = view.fieldNameProduct.getText();
        int quantity = Integer.parseInt(view.fieldQuantity.getText());
        int threshold = Integer.parseInt(view.fieldThreshold.getText());
        float price = Float.parseFloat(view.fieldPrice.getText());
        int barcode = Integer.parseInt(view.fieldBarcode.getText());

        newProduct.name = name;
        newProduct.quantity = quantity;
        newProduct.threshold = threshold;
        newProduct.price = price;
        newProduct.barcode = barcode;
        
        if(model.addProduct(newProduct) == false){
            view.printCantAdd();
        }
    }

    public void goStock(){
        view.window.setVisible(false);
        StockView newView = (StockView) context.get("stock");
        newView.window.setVisible(true);
    }

    public void goThresh(){
        view.window.setVisible(false);
        ThresholdView newView = (ThresholdView) context.get("threshold");
        newView.window.setVisible(true);
    }

    public void goProvider(){
        System.out.println("In an ideal world, program would switch to Provider MVC...\n");
    }

    public void goAddProvider(){
        System.out.println("In an ideal world, program would switch to AddProvider MVC...\n");
    }

    public void goDetailProduct(){
        view.window.setVisible(false);
        ProductDetailView newView = (ProductDetailView) context.get("productDetail");
        newView.window.setVisible(true);
    }
}