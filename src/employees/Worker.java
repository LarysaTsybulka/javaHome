package employees;

import employees.Employee;

public class Worker extends Employee {
    private String name;
    private String position;
    private int startSalary;
    private static final int workingDays = 24;
    private static final double coefficient = 1.5;
    //private static final int allowance = 6;

    public Worker(String name, String position, int startSalary) {
        this.name = name;
        this.position = position;
        this.startSalary = startSalary;
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

    public int getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(int startSalary) {
        this.startSalary = startSalary;
    }

    public double getSalary(){
        double salary, allowance;
        allowance = startSalary*0.3;
        salary = (startSalary +allowance)*coefficient*workingDays*0.5;
        return salary;
    }
}
