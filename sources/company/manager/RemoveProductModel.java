package company.manager;

import company.data.Stock;

public class RemoveProductModel{
    Stock stock;

    public RemoveProductModel(Stock stock){
      this.stock = stock;
    }

    public boolean removeProduct(int barcode){
        return stock.removeProduct(barcode);
    }
}