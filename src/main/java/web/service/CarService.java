package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService implements web.service.Service {
    @Override
    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car((long) 1, "bmv", 3));
        list.add(new Car((long) 2, "audi", 4));
        list.add(new Car((long) 3, "bmv", 7));
        return list;
    }


}
