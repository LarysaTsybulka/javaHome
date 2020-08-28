public class Director extends Employee{
    private String name;
    private String position;
    private int startSalary;
    private static final int workingDays = 24;
    private static final int coefficient = 15;

    public Director(String name, String position, int startSalary) {
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
        double salary;
        salary = coefficient*workingDays*startSalary;
        return salary;
    }
}
