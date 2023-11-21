package collections;

import java.util.Comparator;

public class CovekComparator implements Comparator<Covek> {
    @Override
    public int compare(Covek c1, Covek c2) {
        if (c1 == null) {
            return 0;
        }
        if (c2 == null) {
            return 0;
        }
        return c1.getGodini() - c2.getGodini();
    }
}
