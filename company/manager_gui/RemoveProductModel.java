package company.manager_gui;

import company.data.Stock;
import company.serial.SerializeStock;

public class RemoveProductModel{
    Stock stock;

    public RemoveProductModel(Stock stock){
      this.stock = stock;
    }

    public boolean removeProduct(int barcode){
        if (stock.removeProduct(barcode)) {
          SerializeStock.main(stock);
          return true;
        }
        return false;
    }
}