package company.manager_gui;

import java.util.Scanner;
import java.util.HashMap;

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
}