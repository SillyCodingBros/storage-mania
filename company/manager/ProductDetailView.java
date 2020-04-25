package company.manager;


public class ProductDetailView {
    public ProductDetailView(){

    }
    public void promptBarCode(){
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
    }
}