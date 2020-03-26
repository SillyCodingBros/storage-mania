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

public class Suppliers implements java.io.Serializable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	private ArrayList<Supplier> suppliers;
	private static final long serialVersionUID = 42L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Suppliers(){
		suppliers = new ArrayList<Supplier>();
	}

	public void serializeStock(){
		try {
			 FileOutputStream fileOut = new FileOutputStream("/suppliers.ser");
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
			 out.writeObject(suppliers);
			 out.close();
			 fileOut.close();
			 System.out.printf("Serialized stock is saved in /suppliers.ser");
		} catch (IOException i) {
			 i.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void deserializeStock(){
		try {
				 FileInputStream fileIn = new FileInputStream("/suppliers.ser");
				 ObjectInputStream in = new ObjectInputStream(fileIn);
				 suppliers = (ArrayList<Supplier>) in.readObject();
				 in.close();
				 fileIn.close();

			} catch (IOException i) {
				 i.printStackTrace();
				 return;
			} catch (ClassNotFoundException c) {
				 System.out.println("No previous '/suppliers.ser' found");
				 c.printStackTrace();
				 return;
			}
	}
}

