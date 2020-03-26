package company.manager;

import java.util.Scanner;

import company.data.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MainConsole
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainConsole(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void displayStockProducts() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void displayPurchaseOrders() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void printDisplayedData() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void makePurchaseOrder() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void displayBelowThresholdProducts() {
		// TODO implement me
	}

	public static void main(String[] args) {
		Stock stock = new Stock();
		String input;
		String help = "Avalable commands are : \n\t exit : stops the machine, \n\t help : displays this message, \n";
		//printOrders();
		System.out.println(help);
		while(true){
			Scanner reader = new Scanner(System.in);
			System.out.print(">");
			input = reader.nextLine();
			if(input.equalsIgnoreCase("exit"))
				break;
			else if(input.equalsIgnoreCase("help"))
				System.out.println(help);
			else{
				System.out.println("Unknown command, type 'help' to see supported commands.");
			}
		}
	}
}

