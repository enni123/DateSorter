import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class IDateMain {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(LocalDate.of(2022, Month.MAY, 13), LocalDate.of(2022, Month.MAY, 24), LocalDate.of(2022, Month.MAY, 7),
                LocalDate.of(2022, Month.OCTOBER, 29), LocalDate.of(2022, Month.OCTOBER, 17), LocalDate.of(2022, Month.OCTOBER, 8),
                LocalDate.of(2022, Month.AUGUST, 3), LocalDate.of(2022, Month.AUGUST, 26), LocalDate.of(2022, Month.AUGUST, 31),
                LocalDate.of(2022, Month.JANUARY, 31), LocalDate.of(2022, Month.JANUARY, 1), LocalDate.of(2022, Month.JANUARY, 23),
                LocalDate.of(2022, Month.APRIL, 15), LocalDate.of(2022, Month.APRIL, 5), LocalDate.of(2022, Month.APRIL, 21),
                LocalDate.of(2022, Month.NOVEMBER, 4), LocalDate.of(2022, Month.NOVEMBER, 30), LocalDate.of(2022, Month.NOVEMBER, 11),
                LocalDate.of(2022, Month.SEPTEMBER, 7), LocalDate.of(2022, Month.SEPTEMBER, 25), LocalDate.of(2022, Month.SEPTEMBER, 22),
                LocalDate.of(2022, Month.JULY, 10), LocalDate.of(2022, Month.JULY, 16), LocalDate.of(2022, Month.JULY, 19),
                LocalDate.of(2022, Month.MARCH, 8), LocalDate.of(2022, Month.MARCH, 27), LocalDate.of(2022, Month.MARCH, 2),
                LocalDate.of(2022, Month.FEBRUARY, 28), LocalDate.of(2022, Month.FEBRUARY, 14), LocalDate.of(2022, Month.FEBRUARY, 16),
                LocalDate.of(2022, Month.JUNE, 9), LocalDate.of(2022, Month.JUNE, 29), LocalDate.of(2022, Month.JUNE, 13),
                LocalDate.of(2022, Month.DECEMBER, 31), LocalDate.of(2022, Month.DECEMBER, 3), LocalDate.of(2022, Month.DECEMBER, 6)
        );

        IDateSorterImpl dateSorter = new IDateSorterImpl();
        System.out.println(dateSorter.sortDates(dates));
    }
}
