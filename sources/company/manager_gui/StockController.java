package company.manager;

public class StockController {
    private StockModel model;
    private StockView view;

    public StockController(StockModel model, StockView view){
        this.model = model;
        this.view = view;
    }
    
    /*public void getStockSummury(){
        view.printStock(model.getStockStr());
    }*/
}