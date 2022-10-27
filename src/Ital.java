import java.util.Objects;

public class Ital {
    private String nev;
    private String kiszereles;
    private int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }

    @Override
    public String toString() {
        return
                nev + ", " +
                kiszereles + ", " +
                ar + " Ft";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ital)) return false;
        Ital ital = (Ital) o;
        return Objects.equals(nev, ital.nev) && Objects.equals(kiszereles, ital.kiszereles);
    }

    public interface ItalBolt
    {
            // új italt ad hozzá az italbolthoz
        public void hozzáad(Ital ital);
            // meghatározza az italok összértékét
        public int összÉrték();
            // visszaadja azoknak a szeszesitaloknak a rendezett listáját (a természetes
            // rendezettség sorrendjében), amelyek alkoholtartalma meghaladja a paraméterként
            // megkapott értéket
        public java.util.List<SzeszesItal> erősPiák(double limit);
    }

}
