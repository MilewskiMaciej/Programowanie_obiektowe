import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
import java.util.Arrays;

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
    
    //Zadanie 2
    public static void wypiszTablice(int[] tab, int n, int m) {
        int len = Arrays.stream(tab).mapToObj(String::valueOf).mapToInt(String::length).max().orElse(1);
        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(index < tab.length) {
                    System.out.printf("%" + len + "d ", tab[index]);
                }
                else {
                    System.out.printf("%" + len + "s ", " ");
                }
                index++;
            }
            System.out.println();
        }
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
    
    //Zadanie 3, punkt 8
    public static void ileUnikalnych(int[] tab) {
        int sum = 0;
        int len = tab.length;
        for(int i = 0; i < len; i++) {
            boolean un = true;
            for(int j = 0; j < i; j++) {
                if(tab[i] == tab[j]) {
                    un = false;
                    break;
                }
            }
            if(un) {
                sum += 1;
            }
        }
        System.out.println("Ilosc liczb unikalnych w tablicy: " + sum);
    }

    //Zadanie 4, punkt 1
    public static void sumaDodatnich(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] > 0) {
                sum += tab[i];
            }
        }
        System.out.println("Suma liczb dodatnich w tablicy: " + sum);
    }

    //Zadanie 4, punkt 2
    public static void sumaUjemnych(int[] tab) {
        int len = tab.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(tab[i] < 0) {
                sum += tab[i];
            }
        }
        System.out.println("Suma liczb ujemnych w tablicy: " + sum);
    }

    //Zadanie 4, punkt 3
    public static void sumaOdwrotnosci(int[] tab) {
        int len = tab.length;
        double sum = 0.0;
        for(int i = 0; i < len; i++) {
            if(tab[i] != 0) {
                sum += 1.0/tab[i];
            }
        }
        System.out.println("Suma odwrotnosci liczb w tablicy: " + sum);
    }

    //Zadanie 4, punkt 4
    public static void sredniaArytmetyczna(int[] tab) {
        int len = tab.length;
        double sum = 0.0;
        for(int i = 0; i < len; i++) {
            sum += tab[i];
        }
        System.out.println("Srednia arytmetyczna liczb w tablicy: " + sum/2.0);
    }

    //Zadanie 4, punkt 5
    public static void sredniaGeometryczna(int[] tab) {
        int len = tab.length;
        int il = 1;
        for(int i = 0; i < len; i++) {
            il = il * tab[i];
        }
        double eq = Math.pow(il, 1.0/len);
        System.out.println("Srednia geometryczna liczb w tablicy: " + eq);
    }
    
    //Zadanie 4, punkt 6
    public static void sredniaHarmoniczna(int[] tab) {
        int len = tab.length;
        int mian = 1;
        for(int i = 0; i < len; i++) {
            mian += 1/tab[i];
        }
        double h = len/mian;
        System.out.println("Srednia harmoniczna liczb w tablicy: " + len);
    }
    
    //Zadanie 5, punkt 1
    public static void funkcjaLiniowa(int[] tab, int a, int b) {
        int len = tab.length;
        int[] fun = new int[len];
        System.out.print("Wyniki funkcji liniowej dla a = " + a + " i b = " + b + ": [ ");
        for(int i = 0; i < len; i++) {
            fun[i] = (a * tab[i]) + b;
        }
        for(int j = 0; j < len; j++) {
            System.out.print(fun[j] + " ");
        }
        System.out.println("]");
    }
    
    //Zadanie 5, punkt 2
    public static void funkcjaKwadratowa(int[] tab, int a, int b, int c) {
        int len = tab.length;
        int[] fun = new int[len];
        System.out.print("Wyniki funkcji kwadratowej dla a = " + a + ", b = " + b + " i c = " + c + ": [ ");
        for(int i = 0; i < len; i++) {
            fun[i] = (int)Math.pow(a*tab[i], 2) + b*tab[i] + c;
        }
        for(int j = 0; j < len; j++) {
            System.out.print(fun[j] + " ");
        }
        System.out.println("]");
    }
    
    //Zadanie 5, punkt 3
    public static void funkcjaWykladnicza(int[] tab, int a) {
        int len = tab.length;
        int[] fun = new int[len];
        System.out.print("Wyniki funkcji wykladniczej dla a = " + a + ": [");
        for(int i = 0; i < len; i++) {
            fun[i] = (int)Math.pow(a, tab[i]);
        }
        for(int j = 0; j < len; j++) {
            System.out.print(fun[j] + " ");
        }
        System.out.println("]");
    }
    
    //Zadanie 6, punkt 3
    public static void odwrocTablice(int[] tab) {
        int l = 0;
        int r = tab.length - 1;
        while(l < r) {
            int temp = tab[l];
            tab[l] = tab[r];
            tab[r] = temp;
            l++;
            r--;
        }
        System.out.print("Odwrocona tablica: [ ");
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("]");
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
        int[] tab = generujTablice(10, 2, 50);
        wypisz(tab);
        wypiszTablice(tab, 5, 2);
        ileNieparzystych(tab);
        ileParzystych(tab);
        ileDodatnich(tab);
        ileUjemnych(tab);
        ileZerowych(tab);
        ileMaxymalnych(tab);
        ileMinimalnych(tab);
        ileUnikalnych(tab);
        sumaDodatnich(tab);
        sumaUjemnych(tab);
        sumaOdwrotnosci(tab);
        sredniaArytmetyczna(tab);
        sredniaGeometryczna(tab);
        sredniaHarmoniczna(tab);
        funkcjaLiniowa(tab, 5, 2);
        funkcjaKwadratowa(tab, 5, 2, 4);
        funkcjaWykladnicza(tab, 2);
        odwrocTablice(tab);
    }
}
