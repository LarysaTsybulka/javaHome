package employees;

import employees.Employee;

public class Worker extends Employee {

    private int startSalary;
    private static final int workingDays = 24;
    private static final double coefficient = 1.5;
    //private static final int allowance = 6;

    public Worker(String name, String position, int startSalary) {
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
        double salary, allowance;
        allowance = startSalary * 0.3;
        salary = (startSalary + allowance) * coefficient * workingDays * 0.5;
        return salary;
    }
}
