package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;

public class ThresholdController{

    private ThresholdModel model;
    private ThresholdView view;
    private Stock stock;

    public ThresholdController(ThresholdModel model, ThresholdView view, Stock stock){
        this.model = model;
        this.view = view;
        this.stock =stock;
    }

    public void threshold(){
        view.printStock(model.getStockStr(stock));
    }

}