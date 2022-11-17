import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

public class IDateSorterImpl implements IDateSorter{
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> r1 = unsortedDates.stream().filter(w -> w.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH).contains("r")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<LocalDate> r2 = unsortedDates.stream().filter(w -> !w.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH).contains("r")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<List<LocalDate>> all = Arrays.asList(r1, r2);
        return all.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
