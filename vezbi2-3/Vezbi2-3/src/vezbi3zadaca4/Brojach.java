package vezbi3zadaca4;

public class Brojach {
    private int brojNaPati;
    private int brojNaPatiGlava;
    private int brojNaPatiPetka;

    public void ZgolemibrojachGlava() {
        this.brojNaPatiGlava++;
        this.brojNaPati++;
    }
    public void ZgolemibrojachPetka() {
        this.brojNaPatiPetka++;
        this.brojNaPati++;
    }

    public void ResetBrojachi() {
        brojNaPati = 0;
        brojNaPatiGlava = 0;
        brojNaPatiPetka = 0;
    }

    @Override
    public String toString() {
        return "Brojach{" +
                "brojNaPati=" + brojNaPati +
                ", brojNaPatiGlava=" + brojNaPatiGlava +
                ", brojNaPatiPetka=" + brojNaPatiPetka +
                '}';
    }
}
