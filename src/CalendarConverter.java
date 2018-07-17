public class CalendarConverter {

    static final int MONDAY = 1;
    static final int TUESDAY = 2;
    static final int WEDNESDAY = 3;
    static final int THURSDAY = 4;
    static final int FRIDAY = 5;
    static final int SATURDAY = 6;
    static final int SUNDAY = 7;

    static String converDayToString(int dayNumber) {

        switch (dayNumber) {
            case MONDAY:
                return  "Poniedziałek";

            case TUESDAY:
                return  "Wtorek";

            case WEDNESDAY:
                return  "środa";

            case THURSDAY:
                return  "Czwartek";

            case FRIDAY:
                return  "Piątunio";

            case SATURDAY:
                return  "Sobota";

            case SUNDAY:
                return  "Niedziela";

            default:
                return "nie ma takiego numeru";
        }

    }

}
