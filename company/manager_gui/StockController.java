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
        //view.window.setVisible(false);
        ThresholdView newView = (ThresholdView) context.get("threshold");
        //view.main_window = newView.window;
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

    public void goRemoveProduct(){
        //view.window.setVisible(false);
        RemoveProductView newView = (RemoveProductView) context.get("removeProduct");
        //newView.window.setVisible(true);
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }

    public void goDetailProduct(){
        //view.window.setVisible(false);
        ProductDetailView newView = (ProductDetailView) context.get("productDetail");
        //newView.window.setVisible(true);
        view.main_window.setContentPane(newView.window);
        view.main_window.repaint();
        view.main_window.revalidate();
    }
    /*public void getStockSummury(){
        view.printStock(model.getStockStr());
    }*/
}