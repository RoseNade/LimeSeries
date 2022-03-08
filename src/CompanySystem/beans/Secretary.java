package CompanySystem.beans;

public class Secretary extends Employee {
    private String office;

    public Secretary(String name, double salary, String office) {
        super(name, salary);
        this.office = office;
    }

    public void draw(){
        System.out.println("" +
                "  ________  _______   ______    _______    _______  ___________   __        _______   ___  ___  \n" +
                " /\"       )/\"     \"| /\" _  \"\\  /\"      \\  /\"     \"|(\"     _   \") /\"\"\\      /\"      \\ |\"  \\/\"  | \n" +
                "(:   \\___/(: ______)(: ( \\___)|:        |(: ______) )__/  \\\\__/ /    \\    |:        | \\   \\  /  \n" +
                " \\___  \\   \\/    |   \\/ \\     |_____/   ) \\/    |      \\\\_ /   /' /\\  \\   |_____/   )  \\\\  \\/   \n" +
                "  __/  \\\\  // ___)_  //  \\ _   //      /  // ___)_     |.  |  //  __'  \\   //      /   /   /    \n" +
                " /\" \\   :)(:      \"|(:   _) \\ |:  __   \\ (:      \"|    \\:  | /   /  \\\\  \\ |:  __   \\  /   /     \n" +
                "(_______/  \\_______) \\_______)|__|  \\___) \\_______)     \\__|(___/    \\___)|__|  \\___)|___/      \n" +
                "                                                                                                ");
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "office='" + office + '\'' +
                "} " + super.toString();
    }
}
