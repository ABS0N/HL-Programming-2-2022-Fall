import java.util.Objects;

public class Auto implements Comparable {
    private String marka;
    private String tipus;
    private int loero;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Auto(String marka, String tipus, int loero) {
        this.setMarka(marka);
        this.setTipus(tipus);
        this.setLoero(loero);
    }

    public Auto(String marka, int loero) {
        this.marka = marka;
        this.tipus = "nemtom";
        this.loero = loero;
    }

    public Auto(){
        this.marka = "";
        this.tipus = "";
        this.loero = 0;
    }

    public String getMarka() {
        return marka;
    }

    public String getTipus() {
        return tipus;
    }

    public int getLoero() {
        return loero;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return
                "Márka: " + marka +
                ", Típus: " + tipus +
                ", Lóerő: " + loero
                ;
    }

    public void setLoero(int loero) {
        if(loero > 0) {
            this.loero = loero;
        }
        else{
            System.out.println("0-nál kisebb lóerő");
        }
    }

    @Override
    public int compareTo(Object o) {
        Auto auto = (Auto) o; //nem helyes
        if(this.loero == auto.loero){
            return 0;
        }
        else if(this.loero > auto.loero){
            return 1;
        }
        else{
            return -1;
        }
    }
}