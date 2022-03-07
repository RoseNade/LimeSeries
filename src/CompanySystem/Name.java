package CompanySystem;

public enum Name {
    MOSHE,
    DAVID,
    JACK,
    TAL,
    DANIEL;

    public static String getRandName() {
        return Name.values()[FactoryUtils.randNum(0, Name.values().length - 1)].toString();
    }
}
