import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Jablko jablko = new Jablko("Jablko", 2.5, 100, "2024-12-31", true);
        Marchewka marchewka = new Marchewka("Marchewka", 1.5, 200, "2024-12-30", "Jakaś tam", 3, true);
        System.out.println("Produkty spożywcze:");
        System.out.println(jablko.getNazwa() + ", cena: " + jablko.getCena() + ", czyEkologiczne: " + jablko.isCzyEkologiczne());
        System.out.println("Smak: " + jablko.smak());
        jablko.umyj();
        jablko.zjedz();
        System.out.println(marchewka.getNazwa() + ", odmiana: " + marchewka.getOdmiana() + ", długość: " + marchewka.getDlugosc());
        System.out.println("Smak: " + marchewka.smak());
        marchewka.umyj();
        marchewka.zjedz();
        Laptop laptop = new Laptop("urSus", 4000, 50, "laptop", 3, "Intel III YYY", 16);
        Kurtka kurtka = new Kurtka("Płaszcz", 250, 300, "kurtka", 2, "M", "bałwełna");
        System.out.println("Produkty przemysłowe:");
        System.out.println(laptop.getNazwa() + ", procesor: " + laptop.getProcesor() + ", RAM: " + laptop.getRam() + " GB");
        laptop.wlacz();
        laptop.uzyj();
        laptop.wylacz();
        laptop.zepsuj();
        laptop.napraw();
        System.out.println(kurtka.getNazwa() + ", rozmiar: " + kurtka.getRozmiar() + ", materiał: " + kurtka.getMaterial());
        kurtka.zaloz();
        kurtka.wypierz();
        kurtka.wysusz();
        kurtka.wyprasuj();
        kurtka.zniszcz();
    }
}