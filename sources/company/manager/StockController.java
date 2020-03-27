package company.manager;

import company.data.Stock;

public class StockController {
    private StockModel model;
    private StockView view;
    private Stock stock;

    public StockController(StockModel model, StockView view, Stock stock){
        this.model = model;
        this.view = view;
        this.stock = stock;
    }

    public void getStockSummury(){
        view.printStock(model.getStockStr(stock));
    }
}