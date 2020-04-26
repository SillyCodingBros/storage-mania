package company.manager_gui;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;
import company.serial.SerializeStock;

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

    public StockProduct findProduct(Integer barcode){
        StockProduct toFindProduct;
        toFindProduct = stock.getProductFromBarcode(barcode);

        if(toFindProduct != null){
            return toFindProduct;
        }else{
            return null;
        }
    }

    public boolean removeProduct(int barcode){
        if (stock.removeProduct(barcode)) {
          SerializeStock.main(stock);
          return true;
        }
        return false;
    }
}