package web.model;

public class Car {
    private String carName;
    private String carSeries;
    private String carColor;

    public Car() {}

    public Car(String carName, String carSeries, String carColor) {
        this.carName = carName;
        this.carSeries = carSeries;
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "[ " + carName + " / " + carSeries + " / " + carColor + " ]";
    }
}
