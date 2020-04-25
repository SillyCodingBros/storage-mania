package company.manager;


public class RemoveProductView{
    public RemoveProductView(){
    }

    public void promptBarcode(){
        System.out.print("To delete product barcode :\n\t> ");
    }
    public void printRemoveProduct(){
        System.out.println("Product Deleted");
    }
    public void printCantRemove(){
        System.out.println("Error - Invalid Barcode");
    }
}