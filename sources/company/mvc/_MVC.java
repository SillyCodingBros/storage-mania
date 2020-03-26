package company.mvc;

public class MVC
{
  public String name;
  //public MVC app;
  public Model model;
  public View view;
  public Controller controller;

  public MVC(String name, Model model, View view, Controller controller){
    this.name = name;
    //this.app = app;
    this.model = model;
    this.view = view;
    this.controller = controller;

    this.model.initialize(this);
    this.view.initialize(this);
    this.controller.initialize(this);
  
  }

}