package company.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import company.data.Stock;

public class DeserializeStock {

  public static void main(Stock stock){
    try {
         FileInputStream fileIn = new FileInputStream("saves/stock.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         Stock tmp = (Stock) in.readObject();
         stock.stock = tmp.stock;
         stock.barcodeSet = tmp.barcodeSet;
         in.close();
         fileIn.close();
      } catch (IOException i) {
         //i.printStackTrace();
         System.out.println("No previous 'saves/stock.ser' found");
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("No previous 'saves/stock.ser' found");
         //c.printStackTrace();
         return;
      }
  }
}