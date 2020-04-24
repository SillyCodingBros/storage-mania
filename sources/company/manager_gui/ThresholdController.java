package company.manager;

import java.util.HashMap;

public class ThresholdController{

    private ThresholdModel model;
    private ThresholdView view;
    private HashMap<String, Object> context;

    public ThresholdController(ThresholdModel model, ThresholdView view, HashMap<String, Object> context){
        this.model = model;
        this.view = view;
        this.context = context;

    }

    /*public void threshold(){
        view.printStock(model.getThresholdStr());
    }*/

}