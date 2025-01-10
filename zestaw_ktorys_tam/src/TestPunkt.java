import java.util.*;

class Box<T> {
    T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}

class Counter<T> {
    List<T> lista = new ArrayList<T>();

    public void add(T object) {
        lista.add(object);
    }

    public int getCount() {
        return lista.size();
    }
}

public class TestPunkt {
    public static <T> boolean isEqual(T object1, T object2) {
        return object1.equals(object2);
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setObject("Yyy wahadło");
        System.out.println(box1.getObject());

        Box<Integer> box2 = new Box<>();
        box2.setObject(2);
        System.out.println(box2.getObject());

        Box<Integer> box3 = new Box<>();
        box3.setObject(2);
        System.out.println(box3.getObject());

        System.out.println(isEqual(box2.getObject(), box3.getObject()));

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Yyy");
        stringCounter.add("No");
        stringCounter.add("Yyy");

        Counter<Integer> integerCounter = new Counter<>();
        integerCounter.add(1);
        integerCounter.add(5);
        integerCounter.add(7);

        System.out.println(integerCounter.getCount());

    }
}
