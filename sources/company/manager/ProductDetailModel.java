package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;

public class ProductDetailModel {
    public ProductDetailModel(){

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

    public String findProduct(Integer barcode, Stock stock){
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