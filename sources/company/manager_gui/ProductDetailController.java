package company.manager;

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
}