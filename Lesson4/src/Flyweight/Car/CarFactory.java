package Flyweight.Car;

import java.util.HashMap;

public class CarFactory {

    private HashMap<String, Car> carsList = new HashMap<String, Car>();

    public Car getCar(String carType) {

        Car car = carsList.get(carType);

        if (car == null) {
            if (carType == "Chevrolet") {
                car = new Chevrolet();
                carsList.put("Chevrolet", car);
                System.out.println("A Chevrolet car was CREATED and saved in memory");

            } else if (carType == "BMW") {
                car = new BMW();
                carsList.put("BMW", car);
                System.out.println("A BMW car was CREATED and saved in memory");

            }

        }

        return car;
    }
}