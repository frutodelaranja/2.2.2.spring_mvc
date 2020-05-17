package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(ModelMap model) {

        List<Car> cars = new CarService().getCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
