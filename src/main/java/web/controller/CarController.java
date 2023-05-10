package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("cars")
public class CarController {

    private CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {

        model.addAttribute("list", carService.carsCount(count));
        return "cars";

    }
}
