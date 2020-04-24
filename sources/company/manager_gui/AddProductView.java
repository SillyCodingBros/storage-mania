package company.manager;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AddProductView{
    private AddProductController controller;
    public JFrame window;
    private Font myFont;
	private Font FontTitle;
    private JButton buttonAddProduct;
    private JButton buttonStock;
    private JButton buttonProvider;
    private JButton buttonAddProvider;
    private JButton buttonRemoveProduct;
    private JButton buttonDetailProduct;
    private JButton buttonThreshold;
    private JButton buttonConfirm;
    private JTextField fieldNameProduct;
    private JTextField fieldQuantity;
    private JTextField fieldThreshold;
    private JTextField fieldPrice;
    private JTextField fieldBarcode;
    private JPanel panelRight;
    private JPanel panelBottom;
    private JPanel panelCenter;
    private JLabel title;
    private JPanel paneltext;
    private JLabel nameProduct;
    private JLabel quantity;
    private JLabel threshold;
    private JLabel price;
    private JLabel barcode;
    private JPanel panelConfirm;


    public AddProductView(){
        window = new JFrame();
        //Font size
        myFont = new Font("Comic Sans MS", Font.BOLD, 25);
        FontTitle = new Font("Comic Sans MS", Font.BOLD, 50);

        //buttons bottom panel
        buttonAddProduct = new JButton("Add Product");
        buttonAddProduct.setToolTipText("A button for add a product");
		buttonAddProduct.setPreferredSize(new Dimension(260, 100));
        buttonAddProduct.setFont(myFont);
        
        buttonStock = new JButton("Stock");
		buttonStock.setToolTipText("Button for view the stock");
		buttonStock.setPreferredSize(new Dimension(280, 100));
        buttonStock.setFont(myFont);
        
        buttonProvider = new JButton("Provider");
		buttonProvider.setToolTipText("Button for view the list of Provider");
		buttonProvider.setPreferredSize(new Dimension(280, 100));
        buttonProvider.setFont(myFont);
        
        buttonAddProvider = new JButton("Add Provider");
		buttonAddProvider.setToolTipText("Button for add a Provider");
		buttonAddProvider.setPreferredSize(new Dimension(280, 100));
        buttonAddProvider.setFont(myFont);
        
        buttonRemoveProduct = new JButton("Remove Product");
		buttonRemoveProduct.setToolTipText("Button for Remove a Product");
		buttonRemoveProduct.setPreferredSize(new Dimension(280, 100));
		buttonRemoveProduct.setFont(myFont);

		buttonDetailProduct = new JButton("Detail Product");
		buttonDetailProduct.setToolTipText("Button for view the product detail");
		buttonDetailProduct.setPreferredSize(new Dimension(280, 100));
		buttonDetailProduct.setFont(myFont);

		buttonThreshold = new JButton("Threshold");
		buttonThreshold.setToolTipText("Button for view the product below threshold");
		buttonThreshold.setPreferredSize(new Dimension(280, 100));
		buttonThreshold.setFont(myFont);

		//buttons left panel
		buttonConfirm= new JButton("Confirm");
		buttonConfirm.setToolTipText("Button for Remove a Product");
		buttonConfirm.setPreferredSize(new Dimension(280, 50));
		buttonConfirm.setFont(myFont);

		//field
		fieldNameProduct = new JTextField();
		fieldNameProduct.setFont(myFont);
		fieldNameProduct.setPreferredSize(new Dimension(200, 20));

		fieldQuantity = new JTextField();
		fieldQuantity.setFont(myFont);

		fieldThreshold = new JTextField();
		fieldThreshold.setFont(myFont);

		fieldPrice = new JTextField();
        fieldPrice.setFont(myFont);

        fieldBarcode = new JTextField();
        fieldBarcode.setFont(myFont);
        
        //panel right
        panelRight = new JPanel();
		panelRight.setBorder(new EtchedBorder());
		panelRight.setPreferredSize(new Dimension(290, 110));
		
		panelRight.add(buttonDetailProduct);
		panelRight.add(buttonThreshold);
        panelRight.add(buttonRemoveProduct);
        
        window.add(panelRight, BorderLayout.EAST);

        //panel bottom
        panelBottom = new JPanel();
		panelBottom.setBorder(new EtchedBorder());

		panelBottom.add(buttonAddProduct);
		panelBottom.add(buttonStock);
		panelBottom.add(buttonProvider);
		panelBottom.add(buttonAddProvider);

        window.add(panelBottom, BorderLayout.SOUTH);
        
        //panel center
		panelCenter = new JPanel();
        panelCenter.setBorder(new EtchedBorder());
        
        //title page
		title = new JLabel("Add Product");
		title.setFont(FontTitle);

		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS)); 
		panelCenter.add(title);
		
		window.add(panelCenter, BorderLayout.CENTER);

        //panel in panel center
		paneltext = new JPanel();
		paneltext.setBorder(new EtchedBorder());
		paneltext.setLayout(new BoxLayout(paneltext, BoxLayout.Y_AXIS)); 


		nameProduct = new JLabel("Name Product");
		nameProduct.setFont(myFont);
		paneltext.add(nameProduct);

		paneltext.add(fieldNameProduct);
		paneltext.setFont(myFont);

		quantity = new JLabel("Quantity");  
		quantity.setFont(myFont);
		paneltext.add(quantity);

		paneltext.add(fieldQuantity);

		threshold = new JLabel("Threshold");  
		threshold.setFont(myFont);
		paneltext.add(threshold);

		paneltext.add(fieldThreshold);

		price = new JLabel("Price");  
		price.setFont(myFont);
		paneltext.add(price);

        paneltext.add(fieldPrice);
        
        barcode = new JLabel("Barcode");  
		barcode.setFont(myFont);
		paneltext.add(barcode);

		paneltext.add(fieldBarcode);

		panelConfirm = new JPanel();
		panelConfirm.add(buttonConfirm);
		

		panelCenter.add(paneltext, BorderLayout.WEST);
		panelCenter.add(panelConfirm, BorderLayout.SOUTH);

        //windows setting
        window.setTitle("Storage Mania");
		window.setSize(1200,800);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(false);


    }

    public void setController(AddProductController controller){
        this.controller = controller;
    }
    /*
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
    public void printCantAdd(){
        System.out.println("Error - This barcode is allready in use.");
    }
    public void printEmptyStr(){
        System.out.println("Error - Entered string is empty or not significent.");
    }*/
}