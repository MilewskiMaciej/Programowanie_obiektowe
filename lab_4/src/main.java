import java.util.concurrent.ThreadLocalRandom;

class lab_4 {
    //Zadanie 1
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tab = new int[n];
        tab[0] = minWartosc;
        for(int i = 1; i < n - 1; i++) {
            tab[i] = ThreadLocalRandom.current().nextInt(minWartosc, maxWartosc + 1);
        }
        tab[n - 1] = maxWartosc;
        return tab;
    }

    //Zadanie 3, punkt 1
    public static void ileNieparzystych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] % 2 != 0) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb nieparzystych w tablicy: " + sum);
    }

    //Zadanie 3, punkt 2
    public static void ileParzystych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] % 2 == 0) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb parzystych w tablicy: " + sum);
    }

    //Zadanie 3, punkt 3
    public static void ileDodatnich(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] > 0) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb dodatnich w tablicy: " + sum);
    }

    //Zadanie 3, punkt 4
    public static void ileUjemnych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] < 0) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb ujemnych w tablicy: " + sum);
    }

    //Zadanie 3, punkt 5
    public static void ileZerowych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] == 0) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb zerowych w tablicy: " + sum);
    }

    //Zadanie 3, punkt 6
    public static void ileMaxymalnych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] == tab[len - 1]) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb maksymalnych w tablicy: " + sum);
    }

    //Zadanie 3, punkt 7
    public static void ileMinimalnych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] == tab[0]) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb minimalnych w tablicy: " + sum);
    }

    public static void wypisz(int[] tab) {
        int len = tab.length;
        System.out.print("Tablica: [ ");
        for (int i = 0; i < len; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] tab = generujTablice(10, -2, 50);
        wypisz(tab);
        ileNieparzystych(tab);
        ileParzystych(tab);
        ileDodatnich(tab);
        ileUjemnych(tab);
        ileZerowych(tab);
        ileMaxymalnych(tab);
        ileMinimalnych(tab);
    }
}
