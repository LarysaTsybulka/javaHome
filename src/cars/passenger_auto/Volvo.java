package cars.passenger_auto;

public class Volvo extends PassengerAuto {
    private String model;
    private String countryOfProduction;

    public Volvo(int countOfPassenger, String engine, String model, String countryOfProduction) {
        super(countOfPassenger, engine);
        this.model = model;
        this.countryOfProduction = countryOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public String getInfo() {
        return "Легковой автомобиль " + getModel() + " двигатель " + getEngine()
                + " количество пассажиров " +getCountOfPassenger()+ " страна производитель " + getCountryOfProduction();
    }
}
