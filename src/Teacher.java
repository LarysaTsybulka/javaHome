public class Teacher extends Employee{
    private String name;
    private String position;
    private int countOfHours;
    private static final int workingDays = 24;

    public Teacher(String name, String position, int countOfHours) {
        this.name = name;
        this.position = position;
        this.countOfHours = countOfHours;
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

    public int getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(int countOfHours) {
        this.countOfHours = countOfHours;
    }
    public double getSalary(){
        double salary;
        salary = countOfHours*workingDays*10;
        return salary;
    }
}
