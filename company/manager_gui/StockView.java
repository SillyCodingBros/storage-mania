package company.manager_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

public class StockView {
    public JPanel window;
    public JFrame main_window;
    private StockController controller;
    private Font myFont;
    private Font Fonttable;
	private Font FontTitle;
    private JButton buttonAddProduct;
    private JButton buttonStock;
    private JButton buttonProvider;
    private JButton buttonAddProvider;
    private JButton buttonThreshold;
    private JPanel panelRight;
    private JPanel panelBottom;
    private JPanel panelCenter;
    private JLabel title;
    private JPanel paneltext;
    private JPanel panelConfirm;
    private JTable tableProduct;
    private DefaultTableModel model;
    private JTableHeader header;


    public StockView(JFrame main_win){
        this.main_window = main_win;
        window = new JPanel();
        window.setSize(main_window.getSize());
        window.setLayout(new BorderLayout());
        //Font size
        myFont = new Font("Comic Sans MS", Font.BOLD, 25);
        Fonttable = new Font("Comic Sans MS", Font.BOLD, 20);
        FontTitle = new Font("Comic Sans MS", Font.BOLD, 50);

        //buttons bottom panel
        buttonAddProduct = new JButton("Add Product");
        buttonAddProduct.setToolTipText("A button for add a product");
        buttonAddProduct.setPreferredSize(new Dimension(260, 100));
        buttonAddProduct.setForeground(new Color(255,153,0));
        buttonAddProduct.setFont(myFont);
        buttonAddProduct.setBackground(new Color(34,34,34));
        buttonAddProduct.setBorder(BorderFactory.createBevelBorder(0));
        buttonAddProduct.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goAddProduct();
            }
        });

        buttonStock = new JButton("Stock");
		buttonStock.setToolTipText("Button for view the stock");
		buttonStock.setPreferredSize(new Dimension(280, 100));
        buttonStock.setForeground(new Color(255,153,0));
        buttonStock.setFont(myFont);
        buttonStock.setBackground(new Color(34,34,34));
        buttonStock.setBorder(BorderFactory.createBevelBorder(0));
        buttonStock.setEnabled(false);

        buttonProvider = new JButton("Provider");
		buttonProvider.setToolTipText("Button for view the list of Provider");
		buttonProvider.setPreferredSize(new Dimension(280, 100));
        buttonProvider.setForeground(new Color(255,153,0));
        buttonProvider.setFont(myFont);
        buttonProvider.setBackground(new Color(34,34,34));
        buttonProvider.setBorder(BorderFactory.createBevelBorder(0));
        buttonProvider.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goProvider();
            }
        });

        buttonAddProvider = new JButton("Add Provider");
		buttonAddProvider.setToolTipText("Button for add a Provider");
		buttonAddProvider.setPreferredSize(new Dimension(280, 100));
        buttonAddProvider.setForeground(new Color(255,153,0));
        buttonAddProvider.setFont(myFont);
        buttonAddProvider.setBackground(new Color(34,34,34));
        buttonAddProvider.setBorder(BorderFactory.createBevelBorder(0));
        buttonAddProvider.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goAddProvider();
            }
        });

		buttonThreshold = new JButton("Threshold");
		buttonThreshold.setToolTipText("Button for view the product below threshold");
		buttonThreshold.setPreferredSize(new Dimension(280, 100));
        buttonThreshold.setForeground(new Color(255,153,0));
		buttonThreshold.setFont(myFont);
        buttonThreshold.setBackground(new Color(34,34,34));
        buttonThreshold.setBorder(BorderFactory.createBevelBorder(0));
        buttonThreshold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goThresh();
            }
        });


        //tableProduct
        String[] head = {"Name Product", "Quantity", "Threshold", "Price", "Barcode"};
        Object[][] data = {};


        //panel right
        panelRight = new JPanel();
		panelRight.setBorder(new EtchedBorder());
        panelRight.setPreferredSize(new Dimension(290, 110));
        panelRight.setBackground(Color.BLACK);

		panelRight.add(buttonThreshold);

        window.add(panelRight, BorderLayout.EAST);

        //panel bottom
        panelBottom = new JPanel();
		panelBottom.setBorder(new EtchedBorder());
        panelBottom.setBackground(Color.BLACK);

		panelBottom.add(buttonAddProduct);
		panelBottom.add(buttonStock);
		panelBottom.add(buttonProvider);
		panelBottom.add(buttonAddProvider);

        window.add(panelBottom, BorderLayout.SOUTH);

        //panel center
		panelCenter = new JPanel();
        panelCenter.setBorder(new EtchedBorder());
        panelCenter.setBackground(new Color(34,34,34));

        //title page
		title = new JLabel("Stock");
        title.setFont(FontTitle);
        title.setForeground(new Color(255,153,0));


	    panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
		panelCenter.add(title);

		window.add(panelCenter, BorderLayout.CENTER );

        //panel in panel center
		paneltext = new JPanel();
        paneltext.setBorder(new EtchedBorder());
        paneltext.setLayout(new BoxLayout(paneltext, BoxLayout.Y_AXIS));
        paneltext.setBackground(Color.BLACK);

        model = new DefaultTableModel(data,head);
        tableProduct = new JTable(model);
        tableProduct.setBackground(Color.GRAY);
        tableProduct.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // TODO Auto-generated method stub
                if (!e.getValueIsAdjusting() && tableProduct.getSelectedRow() != -1) 
                    controller.goDetailProduct(Integer.parseInt(tableProduct.getValueAt(tableProduct.getSelectedRow(), 4).toString()));   
            }
        });

        header = tableProduct.getTableHeader();
        header.setFont(Fonttable);
        header.setBackground(new Color(34,34,34));
        header.setForeground(new Color(255,153,0));
        tableProduct.setFont(Fonttable);
        tableProduct.setRowHeight(30);
		paneltext.add(new JScrollPane(tableProduct), BorderLayout.CENTER);


		panelCenter.add(paneltext, BorderLayout.WEST);
        //windows setting
        //window.setTitle("Storage Mania");
		//window.setSize(1200,800);
		//window.setLocationRelativeTo(null);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.setVisible(true);
        //main_window = window;
        //main_window.setVisible(true);
        main_window.setContentPane(window);   //Starting Panel
        main_window.setVisible(true);        //Make the frame visible
    }

    public void setController(StockController controller){
        this.controller = controller;
    }

    public void init(){
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        controller.loadStock();
    }

    public void addRow(String name, Integer qty, Integer inb, Integer thresh, Integer barcode, Float price){
        model.insertRow(tableProduct.getRowCount(), new Object[]{name, qty, thresh, price, barcode});
    }
    /*public void printStock(String str){
        System.out.println(str);
    }*/
}