import java.util.Random;

public class Manager implements Employee{
    private String nameEmployee;
    private double salary;
    private Company company;
    private int incomeManager;

    public Manager(String nameEmployee, double salary, Company company){
        this.nameEmployee = nameEmployee;
        Random random = new Random();
        this.incomeManager = random.nextInt(140_000 - 115_000 + 1) + 115_000;
        this.salary = salary + 0.05 * incomeManager;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {

        return salary;
    }

    public int getIncomeManager() {
        return incomeManager;
    }




}