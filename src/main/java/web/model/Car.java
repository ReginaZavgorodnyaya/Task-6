package web.model;



public class Car {

    private String model;
    private int maxSpeed;
    private int series;

    public Car(){};

    public Car(String model, int maxSpeed, int series) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.series = series;
    }

    public String getModel() { return model;}
    public void setModel(String model) {this.model = model;}
    public int getMaxSpeed() {return maxSpeed;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}
    public int getSeries() {return series;}
    public void setSeries(int series) {this.series = series;}
}
