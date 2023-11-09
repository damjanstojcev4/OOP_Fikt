package vezbi2zadaca5;

public class Main {
    public static void main(String[] args) {
        Predmet predmet1 = new Predmet("Nema ime");
        Predmet predmet2 = new Predmet("WEB");
        Predmet predmet3 = new Predmet("OOP", "IJ",6);

        System.out.println(predmet1.ime_na_predmet);
        System.out.println(predmet2.ime_na_predmet);
        System.out.println(predmet3.ime_na_predmet);
    }
}
