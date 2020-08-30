package cars.passenger_auto;

public class Mercedes extends PassengerAuto {
    private String model;
    private int price;

    public Mercedes(int countOfPassenger, String engine, String model, int price) {
        super(countOfPassenger, engine);
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getInfo() {
        return "Легковой автомобиль " + getModel() + " двигатель " + getEngine()
                + " количество пассажиров " +getCountOfPassenger()+ " цена " + getPrice();
    }
}
