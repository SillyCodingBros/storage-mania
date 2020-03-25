package company.data;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Stock implements java.io.Serializable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public ArrayList<StockProduct> stock;
	private static final long serialVersionUID = 42L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Stock(){
		stock = new ArrayList<StockProduct>();
	}

	public StockProduct getProductFromBarcode(int barcode) {
		for (StockProduct product : stock) {
			if (product.barcode == barcode){
				return product;
			}
		}
		return null;
	}

	public void serializeStock(){
		try {
			 FileOutputStream fileOut =
			 new FileOutputStream("/stock.ser");
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
			 out.writeObject(stock);
			 out.close();
			 fileOut.close();
			 System.out.printf("Serialized stock is saved in /stock.ser");
		} catch (IOException i) {
			 i.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void deserializeStock(){
		try {
         FileInputStream fileIn = new FileInputStream("/stock.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
				 stock = (ArrayList<StockProduct>) in.readObject();
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

	/*
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

}

