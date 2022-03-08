package CompanySystem.beans;

public class Director extends Manager{
    private String group;

    public Director(String name, double salary, String department, String group) {
        super(name, salary, department);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void draw(){
        System.out.println("" +
                " ________   __      _______    _______   ______  ___________  ______     _______   \n" +
                "|\"      \"\\ |\" \\    /\"      \\  /\"     \"| /\" _  \"\\(\"     _   \")/    \" \\   /\"      \\  \n" +
                "(.  ___  :)||  |  |:        |(: ______)(: ( \\___))__/  \\\\__/// ____  \\ |:        | \n" +
                "|: \\   ) |||:  |  |_____/   ) \\/    |   \\/ \\        \\\\_ /  /  /    ) :)|_____/   ) \n" +
                "(| (___\\ |||.  |   //      /  // ___)_  //  \\ _     |.  | (: (____/ //  //      /  \n" +
                "|:       :)/\\  |\\ |:  __   \\ (:      \"|(:   _) \\    \\:  |  \\        /  |:  __   \\  \n" +
                "(________/(__\\_|_)|__|  \\___) \\_______) \\_______)    \\__|   \\\"_____/   |__|  \\___) \n" +
                "                                                                                   ");
    }

    @Override
    public String toString() {
        return "Director{" +
                "group='" + group + '\'' +
                "} " + super.toString();
    }
}
