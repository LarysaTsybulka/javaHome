package employees;

public class Director extends Employee {

    private int startSalary;
    private static final int workingDays = 24;
    private static final int coefficient = 15;

    public Director(String name, String position, int startSalary) {
        super(name, position);
        this.startSalary = startSalary;
    }

    public int getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(int startSalary) {
        this.startSalary = startSalary;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = coefficient * workingDays * startSalary;
        return salary;
    }
}
