package cars.passenger_auto;

public class Lada extends PassengerAuto {
    private String model;
    private String color;

    public Lada(int countOfPassenger, String engine, String model, String color) {
        super(countOfPassenger, engine);
        this.model = model;
        this.color = color;
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
        System.out.println("Легковой автомобиль " + getModel() + " двигатель " + getEngine()
                + " количество пассажиров " +getCountOfPassenger()+ " цвет " + getColor());
    }
}
