package CompanySystem;

import CompanySystem.beans.*;

import java.util.LinkedList;
import java.util.List;

public class FactoryUtils {
    private static int countOffice = 1;

    public static double randNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

//    public static Employee initEmployee() {
//        return new Employee(Name.getRandName(), FactoryUtils.randNum(3_500, 7_000));
//    }

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

    public static double randSalary(Class<?> clazz) {
        if (clazz.equals(Secretary.class)) {
            return FactoryUtils.randNum(7_000, 8_500);
        }
        if (clazz.equals(Engineer.class)) {
            return FactoryUtils.randNum(9_000, 11_000);
        }
        if (clazz.equals(Director.class)) {
            return FactoryUtils.randNum(18_000, 35_000);
        }
        if (clazz.equals(Manager.class)) {
            return FactoryUtils.randNum(12_000, 15_500);
        } else {
            return FactoryUtils.randNum(3_500, 7_000);
        }
    }

    public static List<Employee> initEmployees(int numOfSecretaries, int numOfManagers, int numOfDirectors, int numOfEngineers) {
        List<Employee> employees = new LinkedList<>();
        for (int i = 0; i < numOfSecretaries; i++) {
//            employees.add(Name.getRandName(), randSalary(Employee.class(;
            employees.add(initSecretary());
        }
        for (int i = numOfSecretaries; i < numOfSecretaries + numOfManagers; i++) {
            employees.add(initManager());
        }
        for (int i = numOfSecretaries + numOfManagers; i < numOfSecretaries + numOfManagers + numOfEngineers; i++) {
            employees.add(initEngineer());
        }
        for (int i = numOfSecretaries + numOfManagers + numOfEngineers; i < numOfSecretaries + numOfManagers + numOfEngineers + numOfDirectors; i++) {
            employees.add(initDirector());
        }
        return employees;
    }

}
