package CompanySystem.beans;

public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void draw(){
        System.out.println("" +
                " ___      ___       __      _____  ___        __       _______    _______   _______   \n" +
                "|\"  \\    /\"  |     /\"\"\\    (\\\"   \\|\"  \\      /\"\"\\     /\" _   \"|  /\"     \"| /\"      \\  \n" +
                " \\   \\  //   |    /    \\   |.\\\\   \\    |    /    \\   (: ( \\___) (: ______)|:        | \n" +
                " /\\\\  \\/.    |   /' /\\  \\  |: \\.   \\\\  |   /' /\\  \\   \\/ \\       \\/    |  |_____/   ) \n" +
                "|: \\.        |  //  __'  \\ |.  \\    \\. |  //  __'  \\  //  \\ ___  // ___)_  //      /  \n" +
                "|.  \\    /:  | /   /  \\\\  \\|    \\    \\ | /   /  \\\\  \\(:   _(  _|(:      \"||:  __   \\  \n" +
                "|___|\\__/|___|(___/    \\___)\\___|\\____\\)(___/    \\___)\\_______)  \\_______)|__|  \\___) \n" +
                "                                                                                      ");
    }
    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
