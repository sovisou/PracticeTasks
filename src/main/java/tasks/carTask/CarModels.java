package tasks.carTask;

import java.util.List;
import java.util.stream.Collectors;

public class CarModels {
    /**
     Реалізуй метод getCarModels(), який приймає список автомобілів cars
     та повертає список моделей автомобілів, випущених після 1955 року.
     */

    public static List<String> getCarModels(List<Car> cars) {
        return cars.stream().
                filter(m -> m.getYear() > 1955)
                .map(car -> car.getModel())
                .collect(Collectors.toList());
    }
}
