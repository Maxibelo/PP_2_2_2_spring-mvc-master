package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> carsCount(List<Car> cars, int count) {
        List<Car> carsNumber = new ArrayList<>();
        if (count > 5) {
            return cars;
        } else {
            for (int i = 0; i < count; i++) {
                carsNumber.add(cars.get(i));
            }
            return carsNumber;
        }
    }
}
