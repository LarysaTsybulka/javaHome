package employees;

import employees.Employee;

public class Teacher extends Employee {

    private int countOfHours;
    private static final int workingDays = 24;

    public Teacher(String name, String position, int countOfHours) {
        super(name, position);
        this.countOfHours = countOfHours;
    }

    public int getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(int countOfHours) {
        this.countOfHours = countOfHours;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = countOfHours * workingDays * 10;
        return salary;
    }
}
