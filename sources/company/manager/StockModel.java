package company.manager;

import company.data.Stock;

public class StockModel {
    private Stock stock;

    public String getStockStr(Stock stock){
        String ret;
        ret = stock.toString();
        return ret;
    }
}