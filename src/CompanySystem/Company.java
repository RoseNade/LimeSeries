package CompanySystem;

import CompanySystem.beans.Employee;
import CompanySystem.beans.Manager;

import java.util.Collections;
import java.util.List;

public class Company {
    private static Company instance = new Company();
    private final List<Employee> employees;
    private static int MONTHS = 12;

    private Company() {
        this.employees = FactoryUtils.initEmployees(2, 2, 3, 5);
    }

    public static Company getInstance(){
        return instance;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public void display(){
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double getAverageSalary(){
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            count++;
        }
        return sum / count;
    }

    public double getManagementAverageSalary(){
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if(employee instanceof Manager){
                sum += employee.getSalary();
                count++;
            }
        }
        return sum / count;
    }

    public double getMonthlyPayment(){
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public double getYearlyPayment(){
        return getMonthlyPayment() * MONTHS;
    }

    public int getTotalNumOfEmployees(){
        return employees.size();
    }

    public int getTotalNumOfManagers(){
        int count = 0;
        for (Employee employee : employees) {
            if(employee instanceof Manager){
                count++;
            }
        }
        return count;
    }
}
