package vezbi3zadaca4;

public class Main {
    public static void main(String[] args) {
        Paricka p = new Paricka();
        Brojach b = new Brojach();

        for (int i = 0; i < 100; i++) {
            if (p.FrliParicka() == "glava") {
                b.ZgolemibrojachGlava();
            } else {
                b.ZgolemibrojachPetka();
            }
        }
        System.out.println(b);
    }
}
