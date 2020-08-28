public class Ford extends TruckAuto{
    private int yearOfProduction;
    private String model;

    public Ford(String model, String engine, int liftingCapacity, int yearOfProduction) {
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
    public void getInfo() {
        System.out.println("Грузовой автомобиль " + getModel()+ " двигатель " + super.getEngine() +
                " грузоподъемность "+ super.getLiftingCapacity() + " год выпуска "+getYearOfProduction());
    }
}
