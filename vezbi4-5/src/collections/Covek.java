package collections;

public class Covek {
    private int godini;
    private String ime;

    public Covek(int godini, String ime) {
        this.godini = godini;
        this.ime = ime;
    }

    public int getGodini() {
        return godini;
    }

    public void setGodini(int godini) {
        this.godini = godini;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Човек со " +
                godini + " години и се вика " +
                ime;
    }
}
