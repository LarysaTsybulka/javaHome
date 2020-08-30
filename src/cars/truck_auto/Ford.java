package cars.truck_auto;

public class Ford extends TruckAuto{
    private String color;
    private String model;


    public Ford(String model, String engine, int liftingCapacity, String color) {
        super(engine,liftingCapacity);
        this.color = color;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Грузовой автомобиль " + getModel()+ " двигатель " + super.getEngine() +
                " грузоподъемность "+ super.getLiftingCapacity() + " цвет "+ getColor());
    }
}
