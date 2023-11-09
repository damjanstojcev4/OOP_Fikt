package vezbi2zadaca7;

public class Triagolnik {
    private long a;
    private long b;
    private long c;

    public Triagolnik(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

    public long Plostina() {
        // nekako presmetaj plostina
        // ne e tochna formulata
        return a*b/c;
    }

    public long Perimetar() {
        return a+b+c;
    }

    public void KaziZdravo() {
        System.out.println("Zdravo od triagolnikot");
    }

    public void ZgolemiA() {
        this.a = this.a + 10;
    }

    public void ZgolemiA(int zaKolku) {
        this.a = this.a + zaKolku;
    }

    public void sporedi(Triagolnik triagolnikNaVlez) {
        if (this.a == triagolnikNaVlez.a) {
            System.out.println("Stranite a se ednakvi");
        }
        if (this.b == triagolnikNaVlez.b) {
            System.out.println("Stranite b se ednakvi");
        }
        if (this.c == triagolnikNaVlez.c) {
            System.out.println("Stranite c se ednakvi");
        }
    }

    @Override
    public String toString() {
        return "Triagolnik{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
