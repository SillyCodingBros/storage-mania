package company.manager;

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
}