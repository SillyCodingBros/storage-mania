package company.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import company.data.Stock;

public class DeserializeStock {

  public static void main(Stock stock){
    try {
         FileInputStream fileIn = new FileInputStream("../sources/saves/stock.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         Stock tmp = (Stock) in.readObject();
         stock.stock = tmp.stock;
         stock.barcodeSet = tmp.barcodeSet;
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("No previous '../sources/saves/stock.ser' found");
         c.printStackTrace();
         return;
      }
  }
}