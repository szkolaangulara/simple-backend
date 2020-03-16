package szkolaangulara.com.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cars")
public class CarsRestResource {

    @GetMapping
    public List<Car> fetchAvailableCars() {
        return prepareCarsResponse();
    }

    private List<Car> prepareCarsResponse() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", "A6", "1HGEJ814XVL168593", "petrol", "sedan", 250450, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/a6-1.jpg"));
        cars.add(new Car("Mercedes", "KLASA A", "3FAHP08176R213831", "petrol", "hatchback", 125800, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/mercedesA.jpg"));
        cars.add(new Car("BMW", "SERIA 4", "WVGEP9BP9ED019268","petrol", "sedan", 205600, "https://www.szkolaangulara.pl/wp-content/uploads/2020/01/bmw4.jpg"));


        return cars;
    }
}
