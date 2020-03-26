package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import company.data.Stock;
import company.data.StockProduct;
import company.mvc.Controller;

public class AddProductController extends Controller{

    private AddProductModel model;
    private AddProductView view;
    private Stock stock;

    public AddProductController(AddProductModel model, AddProductView view, Stock stock){
        this.model = model;
        this.view = view;
        this.stock =stock;
        System.out.println("init - controller");
    }

    public void addProduct(){
        Scanner scan = new Scanner(System.in);
        StockProduct newProduct = new StockProduct();
        String input;

        System.out.print("Input new product name :\n> ");
        newProduct.name = scan.nextLine();
        try{
            System.out.print("Input new product quantity :\n> ");
            newProduct.quantity = scan.nextInt();
        }catch(InputMismatchException err){
            System.out.println("Error - Wrong input detected, please try again.");
            return;
        }
        try{
            System.out.print("Input new product threshold :\n> ");
            newProduct.threshold = scan.nextInt();
        }catch(InputMismatchException err){
            System.out.println("Error - Wrong input detected, please try again.");
            return;
        }
        try{
            System.out.print("Input new product price :\n> ");
            newProduct.price = scan.nextFloat();
        }catch(InputMismatchException err){
            System.out.println("Error - Wrong input detected, please try again.");
            return;
        }
        try{
            System.out.print("Input new product barcode :\n> ");
            newProduct.barcode = scan.nextInt();
        }catch(InputMismatchException err){
            System.out.println("Error - Wrong input detected, please try again.");
            return;
        }

        stock.addProduct(newProduct);
    }
}