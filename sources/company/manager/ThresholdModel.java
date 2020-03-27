package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;

public class ThresholdModel{
    public ThresholdModel(){
        
    }

    public String getStockStr(Stock stock){
        String ret;
        ret = stock.toString();
        return ret;
    }
 

}