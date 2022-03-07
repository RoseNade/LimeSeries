package CompanySystem;

import java.util.List;

public class Helper {
    public static double avgSalary(List<Employee> employees) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            count++;
        }
        return sum / count;
    }

    public static double avgManagementSalary(List<Employee> employees) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                sum += employee.getSalary();
                count++;
            }
        }
        return sum / count;
    }

    public static void display(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void report(List<Employee> employees){
        System.out.println(avgSalary(employees));
        System.out.println("-----------------------------------");
        System.out.println(avgManagementSalary(employees));
        System.out.println("-----------------------------------");
        display(employees);
    }
}
