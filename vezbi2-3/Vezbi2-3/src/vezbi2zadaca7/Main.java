package vezbi2zadaca7;

public class Main {
    public static void main(String[] args) {
        Triagolnik t = new Triagolnik(10, 12, 24);

        System.out.println(t);
        System.out.println(t.Plostina());
        System.out.println(t.Perimetar());
        t.KaziZdravo();

        Triagolnik t2 = new Triagolnik(10,12, 4 );
        t.sporedi(t2);
        t2.ZgolemiA(15);
        t.sporedi(t2);

    }
}
