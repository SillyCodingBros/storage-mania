package company.manager_gui;

import company.data.Stock;

public class ThresholdModel{
    private Stock stock;
    private Stock thresholdStock;

    public ThresholdModel(Stock stock){
        this.stock = stock;
        this.thresholdStock = stock.belowThresholdStock();
    }

    public String getThresholdStr(){
        return stock.belowThresholdToString();
    }

    public Stock getThresholdStock(){
        return this.thresholdStock;
    }
}