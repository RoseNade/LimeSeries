package CompanySystem.beans;

public class Engineer extends Employee {
    private String specialty;

    public Engineer(String name, double salary, String specialty) {
        super(name, salary);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void draw(){
        System.out.println("" +
                "  _______  _____  ___    _______   __    _____  ___    _______   _______   _______   \n" +
                " /\"     \"|(\\\"   \\|\"  \\  /\" _   \"| |\" \\  (\\\"   \\|\"  \\  /\"     \"| /\"     \"| /\"      \\  \n" +
                "(: ______)|.\\\\   \\    |(: ( \\___) ||  | |.\\\\   \\    |(: ______)(: ______)|:        | \n" +
                " \\/    |  |: \\.   \\\\  | \\/ \\      |:  | |: \\.   \\\\  | \\/    |   \\/    |  |_____/   ) \n" +
                " // ___)_ |.  \\    \\. | //  \\ ___ |.  | |.  \\    \\. | // ___)_  // ___)_  //      /  \n" +
                "(:      \"||    \\    \\ |(:   _(  _|/\\  |\\|    \\    \\ |(:      \"|(:      \"||:  __   \\  \n" +
                " \\_______) \\___|\\____\\) \\_______)(__\\_|_)\\___|\\____\\) \\_______) \\_______)|__|  \\___) \n" +
                "                                                                                     ");
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "specialty='" + specialty + '\'' +
                "} " + super.toString();
    }
}
