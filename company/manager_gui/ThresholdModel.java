package company.manager_gui;

import company.data.Stock;

public class ThresholdModel{
    private Stock stock;

    public ThresholdModel(Stock stock){
        this.stock = stock;
    }

    public String getThresholdStr(){
        return stock.belowThresholdToString();
    }

    public Stock getThresholdStock(){
        return stock.belowThresholdStock();
    }
}