package employees;

import employees.Employee;

public class Pilot extends Employee {

    private int countOfFlight;
    private static final int coefficient = 49;

    public Pilot(String name, String position, int countOfFlight) {
        super(name, position);
        this.countOfFlight = countOfFlight;
    }

    public int getCountOfFlight() {
        return countOfFlight;
    }

    public void setCountOfFlight(int countOfFlight) {
        this.countOfFlight = countOfFlight;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = countOfFlight * coefficient * 100;
        return salary;
    }
}
