package company.manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveProductController {

  private RemoveProductModel model;
  private RemoveProductView view;

  public RemoveProductController(RemoveProductModel model, RemoveProductView view){
    this.model = model;
    this.view = view;
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