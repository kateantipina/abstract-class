import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private String nameCompany;
    private List<Employee> employesCompany = new ArrayList<>();

    public Company (String nameCompany){
        this.nameCompany = nameCompany;
    }

    public void hire(Employee employee){
        employesCompany.add(employee);
    }

    public void hireAll(List<Employee> employes){
        employesCompany.addAll(employes);
    }

    public void fire(Employee employee){
        employesCompany.remove(employee);
    }

    public int getIncome() {
        int income = 0;

        for (Employee e : getEmployesCompany()){
            if (e instanceof Manager){
                income += ((Manager) e).getIncomeManager();
            }
        }
        return income;
    }
    public List<Employee> getEmployesCompany() {
        return new ArrayList<>(employesCompany);
    }
    public List<Employee> getTopSalaryStaff(int count){
        if (count < 0){
            return Collections.emptyList();
        } if (count > employesCompany.size()){
            count = employesCompany.size();
        }
        List<Employee> topSalaryStaff = new ArrayList<>(employesCompany);
        topSalaryStaff.sort(Comparator.comparing(Employee::getMonthSalary).reversed());
        return topSalaryStaff.subList(0, count);
    }
    public List<Employee> getLowSalaryStaff(int count){
        if (count < 0){
            return Collections.emptyList();
        } if (count > employesCompany.size()){
            count = employesCompany.size();
        }
        List<Employee> lowSalaryStaff = new ArrayList<>(employesCompany);
        lowSalaryStaff.sort(Comparator.comparing(Employee::getMonthSalary));
        return lowSalaryStaff.subList(0, count);
    }

}
