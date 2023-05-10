package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car("BMW", 325, "black"));
        list.add(new Car("Mazda", 3, "red"));
        list.add(new Car("Audi", 5, "blue"));
        list.add(new Car("Peugeot", 207, "grey"));
        list.add(new Car("BMW", 520, "white"));

    }

    @Override
    public List<Car> carsCount(int count) {
        List<Car> carsNumber = new ArrayList<>();
        if (count > 5) {
            return list;
        } else {
            for (int i = 0; i < count; i++) {
                carsNumber.add(list.get(i));
            }
            return carsNumber;
        }
    }
}
