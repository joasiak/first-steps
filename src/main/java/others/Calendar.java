package others;

public class Calendar {

    public void printCalendar() {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int startDay = 1;
        int endDay = 0;
        for (int i = 0; i <= 11; i++) {
            System.out.println("\t" + months[i] + "  2018");

            for (int d = 0; d <= 6; d++) {
                System.out.print(daysOfWeek[d] + "\t\t");
            }
            System.out.println("\n");

            int moveBy = (startDay + endDay) % 7;

            for (int k = 0; k < (moveBy); k++) System.out.print("        ");
            for (int j = 1; j <= daysInMonth[i]; j++) {
                System.out.print(j + "\t\t");
                if (((j + startDay + endDay) % 7 == 0) || (j == daysInMonth[i]))
                    System.out.println();
            }
            endDay = ((endDay) + daysInMonth[i]) % 7;

            System.out.println("\n");

        }
    }
}