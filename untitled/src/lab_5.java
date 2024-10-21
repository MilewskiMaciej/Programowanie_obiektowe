import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab_5 {
    //Zadanie 1
    public static void append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> con = new ArrayList<Integer>();
        con.addAll(tab1);
        con.addAll(tab2);
        System.out.println("Polaczona lista: " + con);
    }

    //Zadanie 2
    public static void merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> con = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < tab1.size() && j < tab2.size()) {
            con.add(tab1.get(i++));
            con.add(tab2.get(j++));
        }
        while(i < tab1.size()) {
            con.add(tab1.get(i++));
        }
        while(j < tab2.size()) {
            con.add(tab2.get(j++));
        }
        System.out.println("Lista polaczona inaczej: " + con);
    }

    //Zadanie 3
    public static void mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> con = new ArrayList();
        con.addAll(tab1);
        con.addAll(tab2);
        Collections.sort(con);
        System.out.println("Lista posortowana rosnaco: " + con);
    }

    //Zadanie 4, punkt 1
    public static void toArrayList_one(String napis) {
        ArrayList<Character> chList = new ArrayList();
        for(char ch : napis.toCharArray()) {
            chList.add(ch);
        }
        Collections.sort(chList);
        System.out.println("Znaki napisu posortowane rosnaco: " + chList);
    }

    //Zadanie 4, punkt 2
    /*
    public static void toArrayList_two(int liczba) {
        List<Integer> inList = numberToList(liczba);
        for(int i : ints)
            inList.add(i);
        }
        Collections.sort(inList);
        System.out.println(inList);
    }
    */
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList();
        tab1.add(1);
        tab1.add(5);
        ArrayList<Integer> tab2 = new ArrayList();
        tab2.add(8);
        tab2.add(2);
        tab2.add(10);
        tab2.add(9);
        String napis = "Pompka";
        int liczba = 15923323;
        System.out.println("Lista 1: " + tab1);
        System.out.println("Lista 2: " + tab2);
        append(tab1, tab2);
        merge(tab1, tab2);
        mergeSorted(tab1, tab2);
        toArrayList_one(napis);
        //toArrayList_two(liczba);
    }
}
