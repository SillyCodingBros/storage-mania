package company.manager_gui;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;

public class ProductDetailModel {

    private Stock stock;

    public ProductDetailModel(Stock stock){
        this.stock = stock;
    }

    public Integer getInputData(Scanner scan){
        Integer toFindId;

        try{
            toFindId = scan.nextInt();
            return toFindId;
        } catch(InputMismatchException err){
            return -1;
        }
    }

    public String findProduct(Integer barcode){
        String ret;
        StockProduct toFindProduct;
        toFindProduct = stock.getProductFromBarcode(barcode);

        if(toFindProduct != null){
            ret = toFindProduct.toString();
            return ret;
        }else{
            return null;
        }
    }
}