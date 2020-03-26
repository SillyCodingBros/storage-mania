package company.manager;

import company.mvc.Controller;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;

public class ProductDetailController extends Controller{

    private ProductDetailModel model;
    private ProductDetailView view;
    private Stock stock;

    public ProductDetailController(ProductDetailModel model, ProductDetailView view, Stock stock){
        this.model = model;
        this.view = view;
        this.stock = stock;
    }   

    public void productDetail(){
        Integer barcode;
        Scanner scan = new Scanner(System.in);
        view.promptBarCode();

        barcode = model.getInputData(scan);
        if(barcode == -1){
            view.printException();
            return;
        } else{
            String str;
            str = model.findProduct(barcode, stock);
            if(str == null){
                view.printNotFound(barcode);
            } else{
                view.printHeader();
                view.printProduct(str);
            }
        }
    }
}