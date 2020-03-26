package company.manager;

import company.mvc.View;

public class AddProductView extends View{
    public AddProductView(){
        System.out.println("init - view");
    }
    
    public void promptName(){
        System.out.print("Input new product name :\n\t> ");
    }
    public void promptQuantity(){
        System.out.print("Input new product quantity :\n\t> ");
    }
    public void printException(){
        System.out.println("Error - Wrong input detected, please try again.");
    }
    public void promptThreshold(){
        System.out.print("Input new product threshold :\n\t> ");
    }
    public void promptPrice(){
        System.out.print("Input new product price :\n\t> ");
    }
    public void promptBarCode(){
        System.out.print("Input new product barcode :\n\t> ");
    }
    public void printAddedProduct(String str){
        System.out.println(str);
    }
}