public class Pilot extends Employee{
    private String name;
    private String position;
    private int countOfFlight;
    private static final int coefficient = 49;

    public Pilot(String name, String position, int countOfFlight) {
        this.name = name;
        this.position = position;
        this.countOfFlight = countOfFlight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCountOfFlight() {
        return countOfFlight;
    }

    public void setCountOfFlight(int countOfFlight) {
        this.countOfFlight = countOfFlight;
    }
    public double getSalary(){
        double salary;
        salary = countOfFlight*coefficient*100;
        return salary;
    }
}
