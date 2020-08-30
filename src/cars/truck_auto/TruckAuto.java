package cars.truck_auto;

public class TruckAuto {
    private String engine;
    private int liftingCapacity;

    public TruckAuto(String engine, int liftingCapacity) {
        this.engine = engine;
        this.liftingCapacity = liftingCapacity;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public void getInfo(){
        System.out.println("Грузовой автомобиль находится на разработке"+ " двигатель "
        + getEngine()+ " грузоподьемность "+getLiftingCapacity());
    }
}
