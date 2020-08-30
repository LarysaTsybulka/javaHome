package cars;

import cars.passenger_auto.*;
import cars.truck_auto.*;

public class ShowCars {
    public static void main (String[] args){
        System.out.println("Перечень грузовых автомобилей:");
        TruckAuto truckAuto = new TruckAuto("дизель", 10);
        truckAuto.getInfo();
        DAF daf = new DAF("DAF 55", "бензин", 5, 2015);
        daf.getInfo();
        Ford ford = new Ford("Ford Cargo","дизель", 7, "синий");
        ford.getInfo();
        Citroen citroen = new Citroen("бензин",6,58000,"Citroen Jumpy");
        citroen.getInfo();
        Kia kia = new Kia("дизель", 4, "Корея", "Kia Rino");
        kia.getInfo();
        System.out.println("");
        System.out.println("Перечень легковых автомобилей:");
        PassengerAuto passengerAuto = new PassengerAuto(4, "бензин");
        passengerAuto.getInfo();
        Toyota toyota = new Toyota(4,"дизель", "Toyota Corola", 2020);
        toyota.getInfo();
        Lada lada = new Lada(4,"бензин", "Lada Kalina", "красный");
        lada.getInfo();
        Mercedes mercedes = new Mercedes(4,"дизель", "Mercedes-Benz A-klasse", 98000);
        mercedes.getInfo();
        Volvo volvo = new Volvo(4,"бензин", "Volvo S 70", "Швеция");
        volvo.getInfo();
    }
}
