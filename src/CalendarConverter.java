public class CalendarConverter {

    static int MONDAY = 1;
    static int TUESDAY = 2;
    static int WEDNESDAY = 3;
    static int THURSDAY = 4;
    static int FRIDAY = 5;
    static int SATURDAY = 6;
    static int SUNDAY = 7;

    static String converDayToString(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Poniedziałek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Sroda";
                break;

            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piątunio";
                break;
            case 6:
                dayName = "Sobota";
                break;
            case 7:
                dayName = "Niedziela";
                break;

                default: dayName = "nie ma takiego numeru";
        }

        return dayName;
    }

}
