import java.util.ArrayList;
import java.util.*;

public class TestPunkt {
    public static <T> void printUnique(Collection<T> items) {
        Set<T> uniqueElements = new HashSet<>(items);
        for(T item : uniqueElements) {
            System.out.println(item);
        }
    }

    public static <T> int countOccurrences(Collection <T> items, T element) {
        int count = 0;
        for(T item : items) {
            if(item.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list) {
        if(list == null || list.size() <= 1) {
            return true;
        }
        ListIterator<T> forward = list.listIterator();
        ListIterator<T> backward = list.listIterator(list.size());
        while (forward.nextIndex() < backward.previousIndex()) {
            T frontElement = forward.next();
            T backElement = backward.previous();
            if(!frontElement.equals(backElement)) {
                return false;
            }
        }
        return true;
    }

    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }

    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> occurrences = new HashMap<>();
        for( V value : map.values()) {
            occurrences.put(value, occurrences.getOrDefault(value, 0) + 1);
        }
        return occurrences;
    }

    public static <K extends Comparable<K>, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        if(map == null || map.isEmpty() || startKey == null || endKey == null) {
            return new TreeMap<>();
        }
        return new TreeMap<>(map.subMap(startKey, true, endKey, true));
    }
}
