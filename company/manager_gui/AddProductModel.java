package company.manager_gui;

import company.data.StockProduct;
import company.serial.SerializeStock;
import company.data.Stock;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AddProductModel{
    private Stock stock;

    public AddProductModel(Stock stock){
        this.stock = stock;
    }

    public Boolean addProduct(StockProduct product){
        Boolean res;
        res = stock.addProduct(product);
        if(res){
            SerializeStock.main(stock);
            return true;
        } else{
            return false;
        }

    }
}