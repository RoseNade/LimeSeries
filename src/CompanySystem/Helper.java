package CompanySystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {

    public static void report(){
        System.out.println(Company.getInstance().getTotalNumOfEmployees());
        System.out.println(Company.getInstance().getTotalNumOfManagers());
        System.out.println(Company.getInstance().getMonthlyPayment());
        System.out.println(Company.getInstance().getYearlyPayment());
        System.out.println(Company.getInstance().getAverageSalary());
        System.out.println(Company.getInstance().getManagementAverageSalary());
    }

    public static String format(LocalDateTime time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");
        return time.format(formatter);
    }
}
