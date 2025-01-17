import java.util.TreeSet;

public class Main {
    public static <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> treeSet, T lowerBound, T upperBound) {
        return new TreeSet<>(treeSet.subSet(lowerBound, true, upperBound, true));
    }

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(8);
        TreeSet<Integer> result = findElementsInRange(treeSet, 1, 7);
        System.out.println(result);
    }
}