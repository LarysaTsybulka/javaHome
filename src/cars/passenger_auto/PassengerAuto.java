package cars.passenger_auto;

public class PassengerAuto {
    private int countOfPassenger;
    private String engine;

    public PassengerAuto(int countOfPassenger, String engine) {
        this.countOfPassenger = countOfPassenger;
        this.engine = engine;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public void setCountOfPassenger(int countOfPassenger) {
        this.countOfPassenger = countOfPassenger;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getInfo(){
        return "Легковой автомобиль находится на разработке" + " двигатель " + getEngine()
        + " количество пассажиров " +getCountOfPassenger();
    }
}
