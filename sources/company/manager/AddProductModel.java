package company.manager;

import company.data.StockProduct;
import company.serial.SerializeStock;
import company.data.Stock;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AddProductModel{
    private Stock stock;

    public AddProductModel(Stock stock){
        this.stock = stock;
    }

    public void test(){
        System.out.println("brah - model");
    }

    public Integer getInputInt(Scanner scan){
        Integer data;

        try{
            data = scan.nextInt();
            return data;
        } catch(InputMismatchException err){
            return -1;
        }
    }

    public Float getInputFloat(Scanner scan){
        Float data;

        try{
            data = scan.nextFloat();
            return data;
        } catch(InputMismatchException err){
            return (float)-1.0;
        }
    }

    public Boolean addProduct(StockProduct product){
        Boolean res;
        res = stock.addProduct(product);
        if(res){
            SerializeStock.main(stock);
            return true;
        } else{
            return false;
        }

    }
}