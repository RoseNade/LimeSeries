package CompanySystem;

public class Test {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        company.display();
        System.out.println("--------------------");
        Helper.report();
    }
}
