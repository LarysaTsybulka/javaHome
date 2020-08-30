package cars;

import cars.passenger_auto.*;
import cars.truck_auto.*;

import java.util.Arrays;
import java.util.List;

public class ShowCars {
    public static void main(String[] args) {
        print("Перечень грузовых автомобилей:");
        TruckAuto[] truckAutoArray = new TruckAuto[]{
                new TruckAuto("дизель", 10),
                new DAF("DAF 55", "бензин", 5, 2015),
                new Ford("Ford Cargo", "дизель", 7, "синий"),
                new Citroen("бензин", 6, 58000, "Citroen Jumpy"),
                new Kia("дизель", 4, "Корея", "Kia Rino")
        };
        printTrucks(truckAutoArray);

        print("");

        print("Перечень легковых автомобилей:");
        PassengerAuto[] passengerAutoArray = new PassengerAuto[]{
                new PassengerAuto(4, "бензин"),
                new Toyota(4, "дизель", "Toyota Corola", 2020),
                new Lada(4, "бензин", "Lada Kalina", "красный"),
                new Mercedes(4, "дизель", "Mercedes-Benz A-klasse", 98000),
                new Volvo(4, "бензин", "Volvo S 70", "Швеция")
        };
        printPassengerCars(passengerAutoArray);
    }

    private static void printTrucks(TruckAuto[] truckAutoArray) {
        List<TruckAuto> truckAutos = Arrays.asList(truckAutoArray);
        truckAutos.forEach(item -> print(item.getInfo()));
    }

    private static void printPassengerCars(PassengerAuto[] passengerAutoArray) {
        List<PassengerAuto> passengerAutos = Arrays.asList(passengerAutoArray);
        passengerAutos.forEach(cars -> print(cars.getInfo()));
    }

    private static void print(String msg) {
        System.out.println(msg);
    }
}
