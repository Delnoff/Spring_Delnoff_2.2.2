package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCarImp implements ServiceCar {

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
}
