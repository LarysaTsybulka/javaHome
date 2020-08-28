public class EmployeeMain {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Александра", "учитель биологии", 25);
        System.out.println("Сотрудник - имя "+ teacher.getName() + " должность " + teacher.getPosition() +
                " зарплата " + teacher.getSalary());
        Worker worker = new Worker("Анатолий", "рабочий", 352);
        System.out.println("Сотрудник - имя "+ worker.getName() + " должность " + worker.getPosition() +
                " зарплата " + worker.getSalary());
        Director director = new Director("Елена", "директор", 456);
        System.out.println("Сотрудник - имя "+ director.getName() + " должность " + director.getPosition() +
                " зарплата " + director.getSalary());
        Pilot pilot = new Pilot("Георгий", "старший пилот", 47);
        System.out.println("Сотрудник - имя "+ pilot.getName() + " должность " + pilot.getPosition() +
                " зарплата " + pilot.getSalary());
    }
}
