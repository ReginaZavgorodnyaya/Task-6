package web.service;



import org.springframework.stereotype.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> listAllCar;


    private void loadData() {
        Car car1 = new Car("Toyota", 250, 111);
        Car car2 = new Car("Nissan", 200, 222);
        Car car3 = new Car("Audi", 300, 333);
        Car car4 = new Car("BMW", 350, 444);
        Car car5 = new Car("Lada", 170, 555);

        listAllCar = new ArrayList<>();
        listAllCar.add(car1);
        listAllCar.add(car2);
        listAllCar.add(car3);
        listAllCar.add(car4);
        listAllCar.add(car5);
    }

    @Override
    public List<Car> getListNumCar(int count) {
        loadData();
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(listAllCar.get(i));
        }
        return list;
    }
}
