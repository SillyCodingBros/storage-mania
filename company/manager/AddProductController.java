package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;
import company.serial.SerializeStock;

public class AddProductController {

    private AddProductModel model;
    private AddProductView view;

    public AddProductController(AddProductModel model, AddProductView view){
        this.model = model;
        this.view = view;
    }

    public void addProduct(){
        Scanner scan = new Scanner(System.in);
        StockProduct newProduct = new StockProduct();
        String summury = "Adding product '";

        view.promptName();
        newProduct.name = scan.nextLine();
        if(newProduct.name.isEmpty() || newProduct.name.startsWith(" ")){
            view.printEmptyStr();
            return;
        }
        summury += newProduct.name + "'. Qty : ";

        view.promptQuantity();
        newProduct.quantity = model.getInputInt(scan);
        if(newProduct.quantity == -1){
            view.printException();
            return;
        } else{
            summury += Integer.toString(newProduct.quantity) + ". Threshold : ";
        }

        view.promptThreshold();
        newProduct.threshold = model.getInputInt(scan);
        if(newProduct.threshold == -1){
            view.printException();
            return;
        }else{
            summury += Integer.toString(newProduct.threshold) + ". Price : ";
        }

        view.promptPrice();
        newProduct.price = model.getInputFloat(scan);
        if(newProduct.price == (float)-1.0){
            view.printException();
            return;
        }else{
            summury += Float.toString(newProduct.price) + "€. Ref : ";
        }
        
        view.promptBarCode();
        newProduct.barcode = model.getInputInt(scan);
        if(newProduct.barcode == -1){
            view.printException();
            return;
        }else{
            summury += Integer.toString(newProduct.barcode) + ".\n";
        }



        if(model.addProduct(newProduct) == false){
            view.printCantAdd();
        } else{
            view.printAddedProduct(summury);
        }



    }
}