package szkolaangulara.com.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cars-model")
public class CarsModelRestResource {

    @GetMapping
    public List<CarModel> fetchAvailableCars() {
        return prepareCarsResponse();
    }

    private List<CarModel> prepareCarsResponse() {
        List<CarModel> cars = new ArrayList<>();
        cars.add(new CarModel("Audi", "A6", "1HGEJ814XVL168593", "petrol", "sedan", 250450));
        cars.add(new CarModel("Mercedes", "KLASA A", "3FAHP08176R213831", "petrol", "hatchback", 125800));
        cars.add(new CarModel("BMW", "SERIA 4", "WVGEP9BP9ED019268","petrol", "sedan", 205600));

        return cars;
    }
}
