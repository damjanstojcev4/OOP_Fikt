package vezbi3zadaca4;

import java.util.Random;

public class Paricka {
    public String FrliParicka() {
        // logika za random biranje dali e petka ili glava

        Random random = new Random();
        int x = random.nextInt(11);

        if (x < 10) {
            return "glava";
        } else {
            return "petka";
        }
    }
}
