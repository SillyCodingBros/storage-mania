package company.manager_gui;

import java.util.Scanner;
import java.util.HashMap;
import company.data.Stock;
import company.data.StockProduct;

public class ProductDetailController{

    private ProductDetailModel model;
    private ProductDetailView view;
    private HashMap<String, Object> context;

    public ProductDetailController(ProductDetailModel model, ProductDetailView view, HashMap<String, Object> context){
        this.model = model;
        this.view = view;
        this.context = context;

    }

    public void productDetail(){
        /*Integer barcode;
        Scanner scan = new Scanner(System.in);
        view.promptBarCode();

        barcode = model.getInputData(scan);
        if(barcode == -1){
            view.printException();
            return;
        } else{
            String str;
            str = model.findProduct(barcode);
            if(str == null){
                view.printNotFound(barcode);
            } else{
                view.printHeader();
                view.printProduct(str);
            }
        }*/
    }

    public void goStock(){
        //view.window.setVisible(false);
        StockView newView = (StockView) context.get("stock");
        //newView.window.setVisible(true);
        newView.init();
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }

    public void goThresh(){
        //view.window.setVisible(false);
        ThresholdView newView = (ThresholdView) context.get("threshold");
        //newView.window.setVisible(true);
        newView.init();
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }

    public void goProvider(){
        System.out.println("In an ideal world, program would switch to Provider MVC...\n");
    }

    public void goAddProvider(){
        System.out.println("In an ideal world, program would switch to AddProvider MVC...\n");
    }

    public void goAddProduct(){
        //view.window.setVisible(false);
        AddProductView newView = (AddProductView) context.get("addProduct");
        //newView.window.setVisible(true);
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }

    public void loadProduct(Integer barcode){
        StockProduct product = model.findProduct(barcode);
        if(product != null){
            view.addData(product.name, product.quantity, product.inbound, product.threshold, product.barcode, product.price);
        }
    }

    public void removeProduct(Integer barcode){
        model.removeProduct(barcode);
        goStock();
    }

    public void updateProduct(String name, Integer barcode, Float price, Integer qty, Integer thresh, Integer inbound){
        StockProduct updated = new StockProduct();
        updated.name = name;
        updated.barcode = barcode;
        updated.price = price;
        updated.quantity = qty;
        updated.inbound = inbound;
        updated.threshold = thresh;
        model.setProduct(updated, barcode);
        goStock();
    }
}