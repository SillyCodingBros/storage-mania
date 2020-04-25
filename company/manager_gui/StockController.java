package company.manager_gui;

import java.util.HashMap;

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
        view.window.setVisible(false);
        ThresholdView newView = (ThresholdView) context.get("threshold");
        newView.window.setVisible(true);
    }

    public void goAddProduct(){
        view.window.setVisible(false);
        AddProductView newView = (AddProductView) context.get("addProduct");
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
    /*public void getStockSummury(){
        view.printStock(model.getStockStr());
    }*/
}