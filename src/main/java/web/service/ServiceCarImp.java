package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCarImp implements ServiceCar {

    private final List<Car> carList;

    public ServiceCarImp() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW","f90","Black"));
        carList.add(new Car("Mercedes","W213","White"));
        carList.add(new Car("Audi","A7","Grey"));
        carList.add(new Car("Land-Rover(Range-Rover)","Velar","Black"));
        carList.add(new Car("BMW","f3x","White"));
    }

    @Override
    public List<Car> getCar(int result) {
        return carList.stream().limit(result).toList();
    }
}
