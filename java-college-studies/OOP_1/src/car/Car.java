package car;

public class Car {
    //private: don't allow the properties to be accessed outside the class
    //public:  allow the properties to be accessed outside the class

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("carrera")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }


}
