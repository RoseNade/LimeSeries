package CompanySystem;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = FactoryUtils.initEmployees(2, 2, 3, 1, 2);
        Helper.report(employees);
    }
}
