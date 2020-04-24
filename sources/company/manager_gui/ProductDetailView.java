package company.manager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

public class ProductDetailView {
    private ProductDetailController controller;
    public JFrame window;
    private Font myFont;
    private Font Fonttable;
	private Font FontTitle;
    private JButton buttonAddProduct;
    private JButton buttonStock;
    private JButton buttonProvider;
    private JButton buttonAddProvider;
    private JButton buttonRemoveProduct;
    private JButton buttonDetailProduct;
    private JButton buttonThreshold;
    private JButton buttonConfirm;
    private JTextField fieldBarcode;
    private JPanel panelRight;
    private JPanel panelBottom;
    private JPanel panelCenter;
    private JLabel title;
    private JPanel paneltext;
    private JLabel barcode;
    private JPanel panelConfirm;
    private JTable tableProduct;
    private JTableHeader header;
    

    public ProductDetailView(){
        window = new JFrame();
        //Font size
        myFont = new Font("Comic Sans MS", Font.BOLD, 25);
        Fonttable = new Font("Comic Sans MS", Font.BOLD, 20);
        FontTitle = new Font("Comic Sans MS", Font.BOLD, 50);

        //buttons bottom panel
        buttonAddProduct = new JButton("Add Product");
        buttonAddProduct.setToolTipText("A button for add a product");
		buttonAddProduct.setPreferredSize(new Dimension(260, 100));
        buttonAddProduct.setFont(myFont);
        buttonAddProduct.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goAddProduct();
            }
        });
        
        buttonStock = new JButton("Stock");
		buttonStock.setToolTipText("Button for view the stock");
		buttonStock.setPreferredSize(new Dimension(280, 100));
        buttonStock.setFont(myFont);
        buttonStock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goStock();
            }
        });
        
        buttonProvider = new JButton("Provider");
		buttonProvider.setToolTipText("Button for view the list of Provider");
		buttonProvider.setPreferredSize(new Dimension(280, 100));
        buttonProvider.setFont(myFont);
        buttonProvider.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goProvider();
            }
        });
        
        buttonAddProvider = new JButton("Add Provider");
		buttonAddProvider.setToolTipText("Button for add a Provider");
		buttonAddProvider.setPreferredSize(new Dimension(280, 100));
        buttonAddProvider.setFont(myFont);
        buttonAddProvider.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goAddProvider();
            }
        });
        
        buttonRemoveProduct = new JButton("Remove Product");
		buttonRemoveProduct.setToolTipText("Button for Remove a Product");
		buttonRemoveProduct.setPreferredSize(new Dimension(280, 100));
        buttonRemoveProduct.setFont(myFont);
        buttonRemoveProduct.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goRemoveProduct();
            }
        });

		buttonDetailProduct = new JButton("Detail Product");
		buttonDetailProduct.setToolTipText("Button for view the product detail");
		buttonDetailProduct.setPreferredSize(new Dimension(280, 100));
        buttonDetailProduct.setFont(myFont);
        buttonDetailProduct.setEnabled(false);

		buttonThreshold = new JButton("Threshold");
		buttonThreshold.setToolTipText("Button for view the product below threshold");
		buttonThreshold.setPreferredSize(new Dimension(280, 100));
        buttonThreshold.setFont(myFont);
        buttonThreshold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goThresh();
            }
        });

		//buttons left panel
		buttonConfirm= new JButton("Confirm");
		buttonConfirm.setToolTipText("Button for Remove a Product");
		buttonConfirm.setPreferredSize(new Dimension(280, 50));
		buttonConfirm.setFont(myFont);

		//field
        fieldBarcode = new JTextField();
        fieldBarcode.setColumns(15);
        fieldBarcode.setFont(myFont);

        //tableProduct
        String[] head = {"Name Product", "Quantity", "Threshold", "Price", "Barcode"};
        Object[][] data = {{"1","2","3","4","5"}};
        
        
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
		title = new JLabel("Detail Product");
		title.setFont(FontTitle);

		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS)); 
		panelCenter.add(title);
		
		window.add(panelCenter, BorderLayout.CENTER );

        //panel in panel center
		paneltext = new JPanel();
		paneltext.setBorder(new EtchedBorder());
        paneltext.setLayout(new BoxLayout(paneltext, BoxLayout.Y_AXIS)); 

        
        barcode = new JLabel("Barcode");  
		barcode.setFont(myFont);
        paneltext.add(barcode);
        
        tableProduct = new JTable(data, head);
        header = tableProduct.getTableHeader();
        header.setFont(Fonttable);
        tableProduct.setFont(Fonttable);
        tableProduct.setRowHeight(30);
		paneltext.add(new JScrollPane(tableProduct), BorderLayout.CENTER);
        

		panelConfirm = new JPanel();
        panelConfirm.add(barcode);
		panelConfirm.add(fieldBarcode);
        panelConfirm.add(buttonConfirm);
        panelConfirm.add(paneltext, BorderLayout.CENTER);

        panelCenter.add(panelConfirm, BorderLayout.NORTH);
		panelCenter.add(paneltext, BorderLayout.WEST);

        //windows setting
        window.setTitle("Storage Mania");
		window.setSize(1200,800);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(false);
    }

    public void setController(ProductDetailController controller){
        this.controller = controller;
    }
    /*public void promptBarCode(){
        System.out.print("Input product barcode :\n\t> ");
    }
    
    public void printException(){
        System.out.println("Error - Wrong input detected. PLease try again.");
    }

    public void printNotFound(Integer id){
        System.out.println("Error - No product found for barcode '" + Integer.toString(id) + "'. Check the typo.");
    }

    public void printProduct(String str){
        System.out.println(str);
    }

    public void printHeader(){
        System.out.println("Name   Qty Owned(inb.)/lim.\tBarcode\t\tPrice");
    }*/
}