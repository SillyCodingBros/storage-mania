package company.manager;

public class ThresholdController{

    private ThresholdModel model;
    private ThresholdView view;


    public ThresholdController(ThresholdModel model, ThresholdView view){
        this.model = model;
        this.view = view;
    }

    /*public void threshold(){
        view.printStock(model.getThresholdStr());
    }*/

}