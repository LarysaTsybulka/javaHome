package cars.truck_auto;

public class DAF extends TruckAuto{
    private int yearOfProduction;
    private String model;

    public DAF(String model, String engine, int liftingCapacity, int yearOfProduction) {
        super(engine,liftingCapacity);
        this.yearOfProduction = yearOfProduction;
        this.model = model;
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
        return "Грузовой автомобиль " + getModel()+ " двигатель " + super.getEngine() +
                " грузоподъемность "+ super.getLiftingCapacity() + " год выпуска "+getYearOfProduction();
    }
}
