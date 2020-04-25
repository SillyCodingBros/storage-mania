package company.manager_gui;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;

public class RemoveProductController {

  private RemoveProductModel model;
  private RemoveProductView view;
  private HashMap<String, Object> context;

  public RemoveProductController(RemoveProductModel model, RemoveProductView view, HashMap <String, Object>context){
    this.model = model;
    this.view = view;
    this.context = context;

  }

  /*public void removeProduct(){
    Scanner scan = new Scanner(System.in);
    view.promptBarcode();
    try{
      int tmp = scan.nextInt();
      if (model.removeProduct(tmp)) view.printRemoveProduct();
      else view.printCantRemove();
    }catch(InputMismatchException err){
      view.printCantRemove();
    }
  }*/
  public void goProvider(){
    System.out.println("In an ideal world, program would switch to Provider MVC...\n");
  }

  public void goAddProvider(){
    System.out.println("In an ideal world, program would switch to AddProvider MVC...\n");
  }

  public void goStock(){
    view.window.setVisible(false);
    StockView newView = (StockView) context.get("stock");
    newView.window.setVisible(true);
  }

  public void goDetailProduct(){
    view.window.setVisible(false);
    ProductDetailView newView = (ProductDetailView) context.get("productDetail");
    newView.window.setVisible(true);
  }

  public void goAddProduct(){
    view.window.setVisible(false);
    AddProductView newView = (AddProductView) context.get("addProduct");
    newView.window.setVisible(true);
  }

  public void goThresh(){
    view.window.setVisible(false);
    ThresholdView newView = (ThresholdView) context.get("threshold");
    newView.window.setVisible(true);
  }
}