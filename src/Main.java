import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company("Компания1");

        for (int i=0; i<180; i++){
            Random random = new Random();
            Operator oper = new Operator("Оператор" + i, random.nextInt(40000 - 30000 + 1) + 30000, company1);
            company1.hire(oper);
        }

        for (int i=0; i<80; i++){
            Random random = new Random();
            Manager manager = new Manager("Менеджер" + i, random.nextInt(100000 - 80000 + 1) + 80000, company1);
            company1.hire(manager);

        }

        for (int i=0; i<10; i++){
            Random random = new Random();
            TopManager topManager = new TopManager("Топ менеджер" + i, random.nextInt(130000 - 110000 + 1) + 110000, company1);
            company1.hire(topManager);
        }

        System.out.println(company1.getIncome());

        System.out.println("Самые высокие зарплаты в компании");

        for (Employee items : company1.getTopSalaryStaff(15)){
            System.out.println(items.getMonthSalary());
        }
        System.out.println("Самые низкие зарплаты в компании");
        for (Employee items : company1.getLowSalaryStaff(30)){
            System.out.println(items.getMonthSalary());
        }
        System.out.println("Количество работников в компании = " + company1.getEmployesCompany().size());

        int count = company1.getEmployesCompany().size() / 2;
        for (int i=0; i < count; i++) {
            int index = (int) Math.round(Math.random() * (company1.getEmployesCompany().size() - 1));
            Employee employee = company1.getEmployesCompany().get(index);
            company1.fire(employee);
        }

        System.out.println("Самые высокие зарплаты в компании");

        for (Employee items : company1.getTopSalaryStaff(10)){
            System.out.println(items.getMonthSalary());
        }
        System.out.println("Самые низкие зарплаты в компании");
        for (Employee items : company1.getLowSalaryStaff(10)){
            System.out.println(items.getMonthSalary());
        }
        System.out.println("Количество работников в компании = " + company1.getEmployesCompany().size());

    }
}