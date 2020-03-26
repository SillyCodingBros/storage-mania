package company.manager;


public class ProductDetailView {
    public ProductDetailView(){

    }
    void promptBarCode(){
        System.out.print("Input product barcode :\n\t> ");
    }
    
    void printException(){
        System.out.println("Error - Wrong input detected. PLease try again.");
    }

    void printNotFound(Integer id){
        System.out.println("Error - No product found for barcode '" + Integer.toString(id) + "'. Check the typo.");
    }

    void printProduct(String str){
        System.out.println(str);
    }

    void printHeader(){
        System.out.println("Name   Qty Owned(inb.)/lim.\tBarcode\t\tPrice");
    }
}