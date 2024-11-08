import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    //Zadanie 1
    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int r) {
        int[] ciag = new int[n];
        for(int i = 0; i < n; i++) {
            ciag[i] = a1 + i * m * r;
        }
        return ciag;
    }

    //Zadanie 2
    public static boolean czyCiagArytmetyczny(int[] tab) {
        if(tab.length < 2) {
            return false;
        }
        int r = tab[1] - tab[0];
        for(int i = 2; i < tab.length; i++) {
            if(tab[i] - tab[i - 1] != r) {
                return false;
            }
        }
        return true;
    }

    //Zadanie 3
    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m) {
        if(tab.length < 2) {
            return false;
        }
        int r = (tab[1] - tab[0]) / m;
        for(int i = m; i < tab.length; i += m) {
            if(tab[i] != tab[i - m] + r) {
                return false;
            }
        }
        return true;
    }

    //Zadanie 4
    public static void podciag(int[] tab) {
        System.out.print("Zadanie 4: ");
        int[] result = new int[tab.length];
        int n = tab[1];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < n && n > tab[i + 1]) {
                result[i] = n;
            }
        }
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
        System.out.println();
    }

    //Zadanie 6
    public static void sekwencjaCollatza(int n, int c) {
        System.out.print("Zadanie 6: ");
        int[] ciag = new int[n];
        for(int i = 0; i < n; i++) {
            if(c % 2 == 0) {
                ciag[i] = c / 2;
                c++;
            }
            else {
                ciag[i] = (3*c) + 1;
                c++;
            }
        }
        for(int l = 0; l < ciag.length; l++) {
            System.out.print(ciag[l] + " ");
        }
        System.out.println();
    }

    public static void minMaxSekwencjaCollatza(int n, int c) {
        System.out.println("Zadanie 7: ");
        int min = c;
        int max = c;
        int[] ciag = new int[n];
        for(int i = 0; i < n; i++) {
            if(c % 2 == 0) {
                ciag[i] = c / 2;
                c++;
            }
            else {
                ciag[i] = (3*c) + 1;
                c++;
            }
        }
        if(c > max) {
            max = c;
        } else {
            min = c;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static void main(String[] args) {
        int[] ciag = ciagArytmetycznyRodzajuM(4, 1, 1, 2);
        int[] tab = new int[7];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 0;
        tab[3] = 3;
        tab[4] = 5;
        tab[5] = 1;
        tab[6] = 4;
        System.out.println("Zadanie 2: " + czyCiagArytmetyczny(ciag));
        System.out.println("Zadanie 3: " + czyCiagArytmetycznyRodzajuM(ciag, 1));
        podciag(tab);
        sekwencjaCollatza(20, 2);
        minMaxSekwencjaCollatza(20, 5);
    }
}