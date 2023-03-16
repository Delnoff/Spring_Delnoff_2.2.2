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

    @Override
    public String toString() {
        return "[ " + carName + " / " + carSeries + " / " + carColor + " ]";
    }
}
