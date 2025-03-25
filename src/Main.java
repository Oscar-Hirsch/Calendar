public class Main {
    public static void main(String[] args) {
        String [] monthsArray = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        String weekDays = "Mo Di Mi Do Fr Sa So ";
        int [] daysofMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startingDay = 1;

        for (int i = 0; i < monthsArray.length; i++) {
            System.out.println(monthsArray[i]);
            System.out.println(weekDays);
            for (int f = 0; f < (startingDay-1); f++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= daysofMonth[i]; j++) {
                System.out.printf("%2d", j);
                System.out.print(" ");
                if ((j + startingDay-1) % 7 == 0) {
                    System.out.println();
                }
                if (j == daysofMonth[i]) {
                    startingDay = ((startingDay + daysofMonth[i]) % 7);
                    if (startingDay == 0) {
                        startingDay = 7;
                    }
                }
            }
            System.out.println();
            System.out.println();
        }

    }


}
