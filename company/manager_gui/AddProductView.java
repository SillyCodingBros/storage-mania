package company.manager_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class AddProductView{
    private AddProductController controller;
    public JPanel window;
    public JFrame main_window;
    private Font myFont;
	private Font FontTitle;
    private JButton buttonAddProduct;
    private JButton buttonStock;
    private JButton buttonProvider;
    private JButton buttonAddProvider;
    private JButton buttonConfirm;
    public JTextField fieldNameProduct;
    public JTextField fieldQuantity;
    private JTextField fieldProvider;
    public JTextField fieldThreshold;
    public JTextField fieldPrice;
    public JTextField fieldBarcode;
    private JPanel panelRight;
    private JPanel panelBottom;
    private JPanel panelCenter;
    private JLabel title;
    private JPanel paneltext;
    private JLabel nameProduct;
    private JLabel quantity;
    private JLabel provider;
    private JLabel threshold;
    private JLabel price;
    private JLabel barcode;
    private JPanel panelConfirm;


    public AddProductView(JFrame main_win){
        this.main_window = main_win;
        window = new JPanel();
        window.setSize(main_window.getSize());
        window.setLayout(new BorderLayout());
        //Font size
        myFont = new Font("Comic Sans MS", Font.BOLD, 25);
        FontTitle = new Font("Comic Sans MS", Font.BOLD, 50);

        //buttons bottom panel
        buttonAddProduct = new JButton("Add Product");
        buttonAddProduct.setToolTipText("A button for add a product");
		buttonAddProduct.setPreferredSize(new Dimension(280, 100));
        buttonAddProduct.setForeground(new Color(255,153,0));
        buttonAddProduct.setFont(myFont);
        buttonAddProduct.setBackground(new Color(34,34,34));
        buttonAddProduct.setBorder(BorderFactory.createBevelBorder(0));
        buttonAddProduct.setEnabled(false);
        buttonAddProduct.setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(128, 77, 0);
            }
        });

        buttonStock = new JButton("Stock");
		buttonStock.setToolTipText("Button for view the stock");
		buttonStock.setPreferredSize(new Dimension(280, 100));
        buttonStock.setForeground(new Color(255,153,0));
        buttonStock.setFont(myFont);
        buttonStock.setBackground(new Color(34,34,34));
        buttonStock.setBorder(BorderFactory.createBevelBorder(0));
        buttonStock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goStock();
            }
        });

        buttonProvider = new JButton("Provider");
		buttonProvider.setToolTipText("Button for view the list of Provider");
		buttonProvider.setPreferredSize(new Dimension(280, 100));
        buttonProvider.setForeground(new Color(255,153,0));
        buttonProvider.setFont(myFont);
        buttonProvider.setBackground(new Color(34,34,34));
        buttonProvider.setBorder(BorderFactory.createBevelBorder(0));
        buttonProvider.setEnabled(false);
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
        buttonAddProvider.setEnabled(false);
        buttonAddProvider.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.goAddProvider();
            }
        });


		//field
		fieldNameProduct = new JTextField();
		fieldNameProduct.setFont(myFont);
		fieldNameProduct.setPreferredSize(new Dimension(200, 20));


		fieldQuantity = new JTextField();
		fieldQuantity.setFont(myFont);
        fieldQuantity.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar() ;

                if (!   ((c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                    ||  (c == KeyEvent.VK_ENTER)      || (c == KeyEvent.VK_TAB)
                    ||  (Character.isDigit(c))))
                {
                e.consume() ;
                }
            }
         });

        fieldProvider = new JTextField();
		fieldProvider.setFont(myFont);
        fieldProvider.setPreferredSize(new Dimension(200, 20));
        fieldProvider.setText("Not configure");
        fieldProvider.setEnabled(false);
        fieldProvider.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                e.consume() ;

            }
         });


		fieldThreshold = new JTextField();
		fieldThreshold.setFont(myFont);
        fieldThreshold.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar() ;

                if (!   ((c == KeyEvent.VK_BACK_SPACE)  || (c == KeyEvent.VK_DELETE)
                    ||  (c == KeyEvent.VK_ENTER)        || (c == KeyEvent.VK_TAB)
                    ||  (Character.isDigit(c))))
                {
                e.consume() ;
                }
            }
         });

		fieldPrice = new JTextField();
        fieldPrice.setFont(myFont);
        fieldPrice.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar() ;

                if (!   ((c == KeyEvent.VK_BACK_SPACE)  || (c == KeyEvent.VK_DELETE)
                    ||  (c == KeyEvent.VK_ENTER)        || (c == KeyEvent.VK_TAB)
                    ||  (c == KeyEvent.VK_PERIOD)       ||  (Character.isDigit(c))))
                {
                e.consume() ;
                }
            }
         });
        fieldBarcode = new JTextField();
        fieldBarcode.setFont(myFont);
        fieldBarcode.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar() ;

                if (!   ((c == KeyEvent.VK_BACK_SPACE)  || (c == KeyEvent.VK_DELETE)
                    ||  (c == KeyEvent.VK_ENTER)        || (c == KeyEvent.VK_TAB)
                    ||  (Character.isDigit(c))))
                {
                e.consume() ;
                }
            }
         });

        //buttons left panel
		buttonConfirm= new JButton("Confirm");
		buttonConfirm.setToolTipText("Button for Remove a Product");
		buttonConfirm.setPreferredSize(new Dimension(280, 50));
        buttonConfirm.setForeground(new Color(255,153,0));
		buttonConfirm.setFont(myFont);
        buttonConfirm.setBackground(new Color(34,34,34));
        buttonConfirm.setBorder(BorderFactory.createBevelBorder(0));
        buttonConfirm.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.addProduct();
                fieldNameProduct.setText("");
                fieldBarcode.setText("");
                fieldPrice.setText("");
                fieldQuantity.setText("");
                fieldThreshold.setText("");
            }
        });

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
		title = new JLabel("Add Product");
		title.setFont(FontTitle);
        title.setForeground(new Color(255,153,0));

		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
		panelCenter.add(title);

		window.add(panelCenter, BorderLayout.CENTER);

        //panel in panel center
		paneltext = new JPanel();
		paneltext.setBorder(new EtchedBorder());
		paneltext.setLayout(new BoxLayout(paneltext, BoxLayout.Y_AXIS));
        paneltext.setBackground(Color.BLACK);


		nameProduct = new JLabel("Name Product");
		nameProduct.setFont(myFont);
        nameProduct.setForeground(new Color(255,153,0));
		paneltext.add(nameProduct);

		paneltext.add(fieldNameProduct);
		paneltext.setFont(myFont);

		quantity = new JLabel("Quantity");
		quantity.setFont(myFont);
        quantity.setForeground(new Color(255,153,0));
		paneltext.add(quantity);

        paneltext.add(fieldQuantity);

        provider = new JLabel("Provider");
		provider.setFont(myFont);
        provider.setForeground(new Color(255,153,0));
		paneltext.add(provider);

        paneltext.add(fieldProvider);

		threshold = new JLabel("Threshold");
		threshold.setFont(myFont);
        threshold.setForeground(new Color(255,153,0));
		paneltext.add(threshold);

		paneltext.add(fieldThreshold);

		price = new JLabel("Price");
		price.setFont(myFont);
        price.setForeground(new Color(255,153,0));
		paneltext.add(price);

        paneltext.add(fieldPrice);

        barcode = new JLabel("Barcode");
		barcode.setFont(myFont);
        barcode.setForeground(new Color(255,153,0));
		paneltext.add(barcode);

		paneltext.add(fieldBarcode);

		panelConfirm = new JPanel();
        panelConfirm.setBackground(Color.BLACK);
		panelConfirm.add(buttonConfirm);


		panelCenter.add(paneltext, BorderLayout.WEST);
		panelCenter.add(panelConfirm, BorderLayout.SOUTH);

        //windows setting
        //window.setTitle("Storage Mania");
		    //window.setSize(1200,800);
		    //window.setLocationRelativeTo(null);
		    //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.setVisible(false);


    }

    public void setController(AddProductController controller){
        this.controller = controller;
    }

    public void printCantAdd(){
        System.out.println("Error - This barcode is allready in use.");
    }
    public void printEmptyStr(){
        System.out.println("Error - Entered string is empty or not significent.");
    }
}
