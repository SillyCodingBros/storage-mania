package company.manager;

import java.util.Scanner;

public class ProductDetailController{

    private ProductDetailModel model;
    private ProductDetailView view;

    public ProductDetailController(ProductDetailModel model, ProductDetailView view){
        this.model = model;
        this.view = view;
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