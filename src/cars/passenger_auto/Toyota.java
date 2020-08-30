package cars.passenger_auto;

public class Toyota extends PassengerAuto {
    private String model;
    private int yearOfProduction;

    public Toyota(int countOfPassenger, String engine, String model, int yearOfProduction) {
        super(countOfPassenger, engine);
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String getInfo() {
        return "Легковой автомобиль " + getModel() + " двигатель " + getEngine()
                + " количество пассажиров " +getCountOfPassenger()+ " год выпуска " + getYearOfProduction();
    }
}
