public class Operator implements Employee{
    private String nameEmployee;
    private double salary;//фиксированная часть зарплаты
    public Operator(String nameEmployee, double salary, Company company){
        this.nameEmployee = nameEmployee;
        this.salary = salary;
    }
    @Override
    public double getMonthSalary() {
        return salary;
    }




}
