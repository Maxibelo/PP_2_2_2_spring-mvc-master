package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 325, "black"));
        list.add(new Car("Mazda", 3, "red"));
        list.add(new Car("Audi", 5, "blue"));
        list.add(new Car("Peugeot", 207, "grey"));
        list.add(new Car("BMW", 520, "white"));
        list = CarService.carsCount(list, count);

        model.addAttribute("list", list);
        return "cars";

    }
}
