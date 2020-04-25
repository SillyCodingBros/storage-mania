# Compilateur
JC = javac
JAR = jar

# Options pour la création des fichiers objets
JFLAGS = -Xlint:all -g
JARFLAGS = cfm


# Chemin pour le dossier des .class
MAINCLASSPATH = *.class
MANAGERCLASSPATH = company/manager/*.class
MANAGERGUICLASSPATH = company/manager_gui/*.class
DATACLASSPATH = company/data/*.class
CASHIERCLASSPATH = company/cashier/*.class
SERIALCLASSPATH = company/serial/*.class
CLASSFILES = $(MAINCLASSPATH) $(MANAGERCLASSPATH) $(MANAGERGUICLASSPATH) $(DATACLASSPATH) $(CASHIERCLASSPATH) $(SERIALCLASSPATH)

# Chemin pour le dossier des .java
MAINPATH = *.java
MANAGERPATH = company/manager/*.java
MANAGERGUIPATH = company/manager_gui/*.java
DATAPATH = company/data/*.java
CASHIERPATH = company/cashier/*.java
SERIALPATH = company/serial/*.java
FILES = $(MAINPATH) $(MANAGERPATH) $(MANAGERGUIPATH) $(DATAPATH) $(CASHIERPATH) $(SERIALPATH)

# Chemin pour les sauvegardes
SAVESPATH = saves

all:
	#-sourcepath $(FILESPATH) -classpath $(CPATH) -d $(CPATH)
	$(JC) $(JFLAGS) $(FILES)