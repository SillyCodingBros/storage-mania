# Compilateur
JC = javac

# Options pour la création des fichiers objets
JFLAGS = -Xlint:all -g

# Chemin pour le dossier des .class
CPATH = classes/

FILESPATH = sources/

DATAPATH = $(FILESPATH)company/data/
DATAFILES = $(DATAPATH)Product.java $(DATAPATH)CheckoutProduct.java $(DATAPATH)StockProduct.java $(DATAPATH)Stock.java $(DATAPATH)Supplier.java $(DATAPATH)Suppliers.java $(DATAPATH)PurchaseOrder.java

CASHIERPATH = $(FILESPATH)company/cashier/
CASHIERFILES = $(CASHIERPATH)SalesOrder.java $(CASHIERPATH)Cashier.java $(CASHIERPATH)Session.java

MANAGERPATH = $(FILESPATH)company/manager/
MANAGERFILES = $(MANAGERPATH)MainConsole.java $(MANAGERPATH)AddProductController.java $(MANAGERPATH)AddProductModel.java $(MANAGERPATH)AddProductView.java $(MANAGERPATH)ProductDetailView.java $(MANAGERPATH)ProductDetailModel.java $(MANAGERPATH)ProductDetailController.java

SERIALPATH = $(FILESPATH)company/serial/
SERIALFILES = $(SERIALPATH)SerializeStock.java $(SERIALPATH)DeserializeStock.java

FILES = $(DATAFILES) $(CASHIERFILES) $(MANAGERFILES) $(SERIALFILES)

all:
	$(JC) $(JFLAGS) -sourcepath $(FILESPATH) -classpath $(CPATH) -d $(CPATH) $(FILES)

#$(data)
#$(cashier)
#$(manager)
#clear:
#rm $(EXEC) *.o