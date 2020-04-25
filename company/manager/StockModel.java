package company.manager;

import company.data.Stock;

public class StockModel {
    private Stock stock;


    public StockModel(Stock stock){
        this.stock = stock;
    }

    public String getStockStr(){
        return stock.toString();
    }
}