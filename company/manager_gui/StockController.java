package company.manager_gui;

import java.util.HashMap;
import company.data.Stock;
import company.data.StockProduct;

public class StockController {
    private StockModel model;
    private StockView view;
    private HashMap<String, Object> context;

    public StockController(StockModel model, StockView view, HashMap<String, Object>context){
        this.model = model;
        this.view = view;
        this.context = context;

    }

    public void goThresh(){
        //view.window.setVisible(false);
        ThresholdView newView = (ThresholdView) context.get("threshold");
        //view.main_window = newView.window;
        newView.init();
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }

    public void goAddProduct(){
        //view.window.setVisible(false);
        AddProductView newView = (AddProductView) context.get("addProduct");
        //newView.window.setVisible(true);
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

    public void goDetailProduct(Integer barcode){
        //view.window.setVisible(false);
        ProductDetailView newView = (ProductDetailView) context.get("productDetail");
        //newView.window.setVisible(true);
        newView.init(barcode);
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }

    public void loadStock(){
        Stock stock = model.getStock();
        for(StockProduct product : stock.stock){
            view.addRow(product.name, product.quantity, product.inbound, product.threshold, product.barcode, product.price);
        }
    }
}