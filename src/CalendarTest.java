import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {

        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);
//вывод названия дней недели
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = Calendar.SUNDAY; i <= weekday ; i++) {
            System.out.print("   ");
//Выравнивнивание первой строки
            if (i == weekday) {
                System.out.print("  ");
            }
        }
//Вывод чисел месяца
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
//отмечаем сегодняшний день
            if(day == today){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
// После каждой субботы переводим курсор на новую строку
            if (weekday == Calendar.SATURDAY){
                System.out.println();
            }
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        while ( d.get(Calendar.MONTH) == month );
        System.out.println();
    }
}
