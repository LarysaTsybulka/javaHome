package cars.truck_auto;

public class Kia extends TruckAuto {
    private String countryOfProduction;
    private String model;

    public Kia(String engine, int liftingCapacity, String countryOfProduction, String model) {
        super(engine, liftingCapacity);
        this.countryOfProduction = countryOfProduction;
        this.model = model;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void getInfo(){
        System.out.println("Грузовой автомобиль " + getModel()+ " двигатель " + super.getEngine() +
                " грузоподъемность "+ super.getLiftingCapacity() + " страна производитель "+ getCountryOfProduction());
    }
}
