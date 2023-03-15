package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;

@Controller
public class CarController {

    private final ServiceCar serviceCar;

    @Autowired
    public CarController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String getCars(Model model,
                          @RequestParam(value = "count", required = false) String count) {
        if (count != null) {
            model.addAttribute("catalog", serviceCar.getCar(Integer.parseInt(count)));
        } else {
            model.addAttribute("catalog", serviceCar.getCar(5));
        }
        return "cars";
    }
}
