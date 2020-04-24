package company.manager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

public class StockView {
    private JFrame window;
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
    private JPanel panelRight;
    private JPanel panelBottom;
    private JPanel panelCenter;
    private JLabel title;
    private JPanel paneltext;
    private JPanel panelConfirm;
    private JTable tableProduct;
    private JTableHeader header;
    

    public StockView(){
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
                System.out.println("Lel test\n");
            }
        });
        
        buttonStock = new JButton("Stock");
		buttonStock.setToolTipText("Button for view the stock");
		buttonStock.setPreferredSize(new Dimension(280, 100));
        buttonStock.setFont(myFont);
        //buttonStock.addActionListener(new ActionListener());
        
        buttonProvider = new JButton("Provider");
		buttonProvider.setToolTipText("Button for view the list of Provider");
		buttonProvider.setPreferredSize(new Dimension(280, 100));
        buttonProvider.setFont(myFont);
        //buttonProvider.addActionListener(new ActionListener());

        
        buttonAddProvider = new JButton("Add Provider");
		buttonAddProvider.setToolTipText("Button for add a Provider");
		buttonAddProvider.setPreferredSize(new Dimension(280, 100));
        buttonAddProvider.setFont(myFont);
        //buttonAddProvider.addActionListener(new ActionListener());
        
        buttonRemoveProduct = new JButton("Remove Product");
		buttonRemoveProduct.setToolTipText("Button for Remove a Product");
		buttonRemoveProduct.setPreferredSize(new Dimension(280, 100));
		buttonRemoveProduct.setFont(myFont);
        //buttonRemoveProduct.addActionListener(new ActionListener());

		buttonDetailProduct = new JButton("Detail Product");
		buttonDetailProduct.setToolTipText("Button for view the product detail");
		buttonDetailProduct.setPreferredSize(new Dimension(280, 100));
		buttonDetailProduct.setFont(myFont);
        //buttonDetailProduct.addActionListener(new ActionListener());

		buttonThreshold = new JButton("Threshold");
		buttonThreshold.setToolTipText("Button for view the product below threshold");
		buttonThreshold.setPreferredSize(new Dimension(280, 100));
		buttonThreshold.setFont(myFont);
        buttonThreshold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Lel thresh\n");
            }
        });


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
		title = new JLabel("Stock");
		title.setFont(FontTitle);

	    panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS)); 
		panelCenter.add(title);
		
		window.add(panelCenter, BorderLayout.CENTER );

        //panel in panel center
		paneltext = new JPanel();
		paneltext.setBorder(new EtchedBorder());
        paneltext.setLayout(new BoxLayout(paneltext, BoxLayout.Y_AXIS)); 

        
        tableProduct = new JTable(data, head);
        header = tableProduct.getTableHeader();
        header.setFont(Fonttable);
        tableProduct.setFont(Fonttable);
        tableProduct.setRowHeight(30);
		paneltext.add(new JScrollPane(tableProduct), BorderLayout.CENTER);
        

		panelCenter.add(paneltext, BorderLayout.WEST);

        //windows setting
        window.setTitle("Storage Mania");
		window.setSize(1200,800);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    
    /*public void printStock(String str){      
        System.out.println(str);
    }*/
}