package őslény;

import java.util.Objects;

public class Őshüllő implements Comparable<Őshüllő> {
    protected String faj;
    protected String élettér;
    protected boolean növényevő;

    public Őshüllő (String faj, String élettér, boolean növényevő){
        this.faj = faj;
        this.élettér = élettér;
        this.növényevő = növényevő;
    }

    public String getFaj() {
        return faj;
    }

    public String getÉlettér() {
        return élettér;
    }

    public boolean isNövényevő() {
        return növényevő;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }

    public void setÉlettér(String élettér) {
        this.élettér = élettér;
    }

    public void setNövényevő(boolean növényevő) {
        this.növényevő = növényevő;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Őshüllő őshüllő = (Őshüllő) o;
        return faj.equals(őshüllő.faj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faj, élettér, növényevő);
    }

    @Override
    public String toString() {
        String növényevőString = (növényevő) ? ", növényevő" : "";
        return  faj+" "+növényevőString;
    }


    @Override
    public int compareTo(Őshüllő o) {
        return 0;
    }
}