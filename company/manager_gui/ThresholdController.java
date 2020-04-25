package company.manager_gui;

import company.data.Stock;
import company.data.StockProduct;
import java.util.HashMap;

public class ThresholdController{

    private ThresholdModel model;
    private ThresholdView view;
    private HashMap<String, Object> context;

    public ThresholdController(ThresholdModel model, ThresholdView view, HashMap<String, Object> context){
        this.model = model;
        this.view = view;
        this.context = context;

    }

    public void goAddProduct(){
        view.window.setVisible(false);
        AddProductView newView = (AddProductView) context.get("addProduct");
        newView.window.setVisible(true);
    }

    public void goStock(){
        view.window.setVisible(false);
        StockView newView = (StockView) context.get("stock");
        newView.init();
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

    public void loadThresh(){
        Stock thresh = model.getThresholdStock();
        for(StockProduct product : thresh.stock){
            view.addRow(product.name, product.quantity, product.inbound, product.threshold, product.barcode, product.price);
        }
    }
    /*public void threshold(){
        view.printStock(model.getThresholdStr());
    }*/

}