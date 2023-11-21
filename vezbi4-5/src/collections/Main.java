package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("OOP");
        lista.add("WEB");
        lista.add("PMP");
        System.out.println(lista.size());
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        List<Covek> coveci = new ArrayList<Covek>();
        coveci.add(new Covek(10, "ilija"));
        coveci.add(new Covek(45, "majka"));
        Covek c = new Covek(15, "brat");
        coveci.add(c);
        System.out.println(coveci);

        coveci.sort(new CovekComparator());
        System.out.println(coveci);

        for (int i =0; i < coveci.size(); i++) {
            System.out.println(coveci.get(i));
        }

        List<String> imejli = new ArrayList<>();
        for (int i = 5; i <= 20; i+=5) {
            imejli.add("mail"+i+"@yahoo.com");
        }
        System.out.println(imejli);
    }
}
