public class TopManager implements Employee{
    private String nameEmployee;
    private double salary;
    private Company company;

    public TopManager(String nameEmployee, double salary, Company company){
        this.nameEmployee = nameEmployee;
        this.salary = company.getIncome() > 10_000_000 ? (salary + 1.5 * salary) : salary;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }




}