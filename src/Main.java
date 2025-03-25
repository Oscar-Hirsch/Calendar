public class Main {
    public static void main(String[] args) {
        String [] monthsArray = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        for (int i = 1; i <= 12; i++) {
            System.out.println(monthsArray[i - 1]);
            month(i);

        }

    }

    public static void month(int month) {
        String [] weekdays = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        for (int i = 1; i <= 7; i++) {
            System.out.print(weekdays[i - 1]+ " ");
        }

        if (month == 2) {
            for (int i = 1; i <= 28;) {
                System.out.println("");
                for (int days = 1; days <= 7; days++) {
                    System.out.print(i + " ");
                    i++;
                }
            }
        } else if (isEven(month)) {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 1; i <= 31; i++) {
                System.out.println(i);
            }

        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
