package web.model;

import org.springframework.stereotype.Component;
import web.service.ServiceCar;
import java.util.ArrayList;
import java.util.List;

@Component
public class Car implements ServiceCar {
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
    public List<Car> getCar(int result) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW","f90","Black"));
        carList.add(new Car("Mercedes","W213","White"));
        carList.add(new Car("Audi","A7","Grey"));
        carList.add(new Car("Land-Rover(Range-Rover)","Velar","Black"));
        carList.add(new Car("BMW","f3x","White"));
        return carList.stream().limit(result).toList();
    }

    @Override
    public String toString() {
        return "[ " + carName + " / " + carSeries + " / " + carColor + " ]";
    }
}
