package company.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import company.data.Stock;

public class SerializeStock {

   public static void main(Stock stock) {
      //Stock stock = new Employee();
      //e.name = "Reyan Ali";
      //e.address = "Phokka Kuan, Ambehta Peer";
      //e.SSN = 11122333;
      //e.number = 101;

      try {
         FileOutputStream fileOut = new FileOutputStream("../sources/saves/stock.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(stock);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in sources/saves/stock.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
/*
public void serializeStock(){
  try {
     FileOutputStream fileOut = new FileOutputStream("/stock.ser");
     ObjectOutputStream out = new ObjectOutputStream(fileOut);
     out.writeObject(this);
     out.close();
     fileOut.close();
     System.out.printf("Serialized stock is saved in /stock.ser");
  } catch (IOException i) {
    System.out.println("Catch U!");
     i.printStackTrace();
  }
}

//@SuppressWarnings("unchecked")
public void deserializeStock(){
  try {
       FileInputStream fileIn = new FileInputStream("/stock.ser");
       ObjectInputStream in = new ObjectInputStream(fileIn);
       Stock tmp = (Stock) in.readObject();
       this.stock = tmp.stock;
       in.close();
       fileIn.close();

    } catch (IOException i) {
       i.printStackTrace();
       return;
    } catch (ClassNotFoundException c) {
       System.out.println("No previous '/stock.ser' found");
       c.printStackTrace();
       return;
    }
}


import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;

      try {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
*/