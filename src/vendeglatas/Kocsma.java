package vendeglatas;

import java.util.List;

public class Kocsma implements Ital.ItalBolt {
    private String nev;

    public Kocsma(String nev) {
        this.nev = nev;
    }

    @Override
    public void hozzáad(Ital ital) {

    }

    @Override
    public int összÉrték() {
        return 0;
    }

    @Override
    public List<SzeszesItal> erősPiák(double limit) {
        return null;
    }
}
