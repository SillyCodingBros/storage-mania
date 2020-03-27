package company.manager;

public class StockView {
    public void printStock(String str){
        System.out.println(str);
    }
    public void printHeader(){
        System.out.println("Name   Qty Owned(inb.)/lim.\tBarcode\t\tPrice");
    }
}