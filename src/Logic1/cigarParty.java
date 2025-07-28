package Logic1;

public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            // On weekend, only need 40 or more cigars
            return cigars >= 40;
        } else {
            // On weekdays, must be between 40 and 60 inclusive
            return cigars >= 40 && cigars <= 60;
        }
    }

}
