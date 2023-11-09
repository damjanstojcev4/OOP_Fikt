package vezbi2zadaca5;

public class Predmet {
    public String ime_na_predmet;
    public String profesor;
    public int brKrediti;
    public int semestar;

    // prv constructor
    public Predmet() {
    }

    // vtor dinamicen constructor
    public Predmet(String ime_na_predmet) {
        this.ime_na_predmet = ime_na_predmet;
    }

    // tretior constructor
    public Predmet(String ime_na_predmet, String profesor, int brKrediti) {
        this.ime_na_predmet = ime_na_predmet;
        this.profesor = profesor;
        this.brKrediti = brKrediti;
    }
}
