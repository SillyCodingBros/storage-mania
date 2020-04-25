package company.mvc;

public class Controller
{
  MVC mvc;
  
  public Controller(){
    super();
  }

  public void initialize(MVC mvc){
    this.mvc = mvc;
  }
}