package company.manager;

import company.data.Stock;

public class ThresholdModel{
    private Stock stock;

    public ThresholdModel(Stock stock){
        this.stock = stock;
        
    }

    public String getStockStr(){
        String ret;
        ret = stock.belowThresholdToString();
        return ret;
    }
 

}