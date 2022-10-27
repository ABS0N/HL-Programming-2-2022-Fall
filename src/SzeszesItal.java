public class SzeszesItal extends Ital{

    private float alkohol;

    public SzeszesItal(String nev, String kiszereles, int ar, float alkohol) {
        super(nev, kiszereles, ar);
        this.alkohol = alkohol;
    }

    public float getAlkohol() {
        return alkohol;
    }

    @Override
    public String toString() {
        return
                alkohol + "% alkoholtartalmú " +
                getNev() + ", " +
                getKiszereles() + ", " +
                getAr() + " Ft";
    }
}
