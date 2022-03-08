package CompanySystem.beans;

import CompanySystem.FactoryUtils;

public enum Name {
    MOSHE,
    DAVID,
    JACK,
    TAL,
    DANIEL;

    public static String getRandName() {
        return values()[(int) FactoryUtils.randNum(0, Name.values().length - 1)].name().toLowerCase();
    }
}
