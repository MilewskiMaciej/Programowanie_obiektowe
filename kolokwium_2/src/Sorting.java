import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static <T extends Comparable<T>> void sortDescending(T[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
    }
}
