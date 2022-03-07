package CompanySystem;

import java.util.ArrayList;
import java.util.List;

public class FactoryUtils {
    private static int countOffice = 1;

    public static int randNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static Employee initEmployee() {
        return new Employee(Name.getRandName(), FactoryUtils.randNum(3_500, 7_000));
    }

    public static Secretary initSecretary() {
        int officeCount = countOffice++;
        return new Secretary(Name.getRandName(), FactoryUtils.randNum(7_000, 8_500), "Office " + officeCount);
    }

    public static Engineer initEngineer() {
        return new Engineer(Name.getRandName(), FactoryUtils.randNum(9_000, 11_000), "Program");
    }

    public static Manager initManager() {
        return new Manager(Name.getRandName(), FactoryUtils.randNum(12_000, 15_500), "Computers");
    }

    public static Director initDirector() {
        return new Director(Name.getRandName(), FactoryUtils.randNum(18_000, 35_000), "Computers", "IT");
    }

    public static double randSalary(Employee employee) {
        if (employee instanceof Secretary) {
            return FactoryUtils.randNum(7_000, 8_500);
        } else if (employee instanceof Engineer) {
            return FactoryUtils.randNum(9_000, 11_000);
        } else if (employee instanceof Director) {
            return FactoryUtils.randNum(18_000, 35_000);
        } else if (employee instanceof Manager) {
            return FactoryUtils.randNum(12_000, 15_500);
        } else {
            return FactoryUtils.randNum(3_500, 7_000);
        }
    }

    public static List<Employee> initEmployees(int numOfSecretaries, int numOfManagers, int numOfEmployees, int numOfDirectors, int numOfEngineers) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numOfSecretaries; i++) {
            employees.add(initSecretary());
        }
        for (int i = numOfSecretaries; i < numOfSecretaries + numOfEmployees; i++) {
            employees.add(initEmployee());
        }
        for (int i = numOfSecretaries + numOfSecretaries; i < numOfSecretaries + numOfEmployees + numOfManagers; i++) {
            employees.add(initManager());
        }
        for (int i = numOfSecretaries + numOfEmployees + numOfManagers; i < numOfSecretaries + numOfEmployees + numOfManagers + numOfEngineers; i++) {
            employees.add(initEngineer());
        }
        for (int i = numOfSecretaries + numOfEmployees + numOfManagers + numOfEngineers; i < numOfSecretaries + numOfEmployees + numOfManagers + numOfEngineers + numOfDirectors; i++) {
            employees.add(initDirector());
        }
        return employees;
    }

//    public static double avgSalary(List<Employee> employees) {
//        int sum = 0;
//        int count = 0;
//        for (Employee employee : employees) {
//            sum += employee.getSalary();
//            count++;
//        }
//        return sum / count;
//    }
//
//    public static double avgManagementSalary(List<Employee> employees) {
//        int sum = 0;
//        int count = 0;
//        for (Employee employee : employees) {
//            if (employee instanceof Manager || employee instanceof Director) {
//                sum += employee.getSalary();
//                count++;
//            }
//        }
//        return sum / count;
//    }
//
//    public static void display(List<Employee> employees) {
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//    }

}
