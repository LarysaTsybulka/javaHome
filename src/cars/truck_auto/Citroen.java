package cars.truck_auto;

public class Citroen extends TruckAuto {
    private int price;
    private String model;

    public Citroen(String engine, int liftingCapacity, int price, String model) {
        super(engine, liftingCapacity);
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String getInfo() {
        return "Грузовой автомобиль " + getModel()+ " двигатель " + super.getEngine() +
                " грузоподъемность "+ super.getLiftingCapacity() + " цена "+ getPrice();
    }
}
