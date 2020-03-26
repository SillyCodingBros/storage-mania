package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;
import company.serial.SerializeStock;

public class AddProductController {

    private AddProductModel model;
    private AddProductView view;
    private Stock stock;

    public AddProductController(AddProductModel model, AddProductView view, Stock stock){
        this.model = model;
        this.view = view;
        this.stock =stock;
    }

    public void addProduct(){
        Scanner scan = new Scanner(System.in);
        StockProduct newProduct = new StockProduct();
        String summury = "Adding product '";

        view.promptName();
        newProduct.name = scan.nextLine();
        summury += newProduct.name + "'. Qty : ";
        try{
            view.promptQuantity();
            newProduct.quantity = scan.nextInt();
        }catch(InputMismatchException err){
            view.printException();
            return;
        }
        summury += Integer.toString(newProduct.quantity) + ". Threshold : ";
        try{
            view.promptThreshold();
            newProduct.threshold = scan.nextInt();
        }catch(InputMismatchException err){
            view.printException();
            return;
        }
        summury += Integer.toString(newProduct.threshold) + ". Price : ";
        try{
            view.promptPrice();
            newProduct.price = scan.nextFloat();
        }catch(InputMismatchException err){
            view.printException();
            return;
        }
        summury += Float.toString(newProduct.price) + "€. Ref : ";
        try{
            view.promptBarCode();
            newProduct.barcode = scan.nextInt();
        }catch(InputMismatchException err){
            view.printException();
            return;
        }
        summury += Integer.toString(newProduct.barcode) + ".\n";
        view.printAddedProduct(summury);
        stock.addProduct(newProduct);
        SerializeStock.main(stock);
    }
}