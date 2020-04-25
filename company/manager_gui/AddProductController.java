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
        /*Scanner scan = new Scanner(System.in);
        StockProduct newProduct = new StockProduct();
        String summury = "Adding product '";

        view.promptName();
        newProduct.name = scan.nextLine();
        if(newProduct.name.isEmpty() || newProduct.name.startsWith(" ")){
            view.printEmptyStr();
            return;
        }
        summury += newProduct.name + "'. Qty : ";

        view.promptQuantity();
        newProduct.quantity = model.getInputInt(scan);
        if(newProduct.quantity == -1){
            view.printException();
            return;
        } else{
            summury += Integer.toString(newProduct.quantity) + ". Threshold : ";
        }

        view.promptThreshold();
        newProduct.threshold = model.getInputInt(scan);
        if(newProduct.threshold == -1){
            view.printException();
            return;
        }else{
            summury += Integer.toString(newProduct.threshold) + ". Price : ";
        }

        view.promptPrice();
        newProduct.price = model.getInputFloat(scan);
        if(newProduct.price == (float)-1.0){
            view.printException();
            return;
        }else{
            summury += Float.toString(newProduct.price) + "€. Ref : ";
        }

        view.promptBarCode();
        newProduct.barcode = model.getInputInt(scan);
        if(newProduct.barcode == -1){
            view.printException();
            return;
        }else{
            summury += Integer.toString(newProduct.barcode) + ".\n";
        }



        if(model.addProduct(newProduct) == false){
            view.printCantAdd();
        } else{
            view.printAddedProduct(summury);
        }
        */


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

    public void goRemoveProduct(){
        view.window.setVisible(false);
        RemoveProductView newView = (RemoveProductView) context.get("removeProduct");
        newView.window.setVisible(true);
    }

    public void goDetailProduct(){
        view.window.setVisible(false);
        ProductDetailView newView = (ProductDetailView) context.get("productDetail");
        newView.window.setVisible(true);
    }
}