package őslény;

public class Dínó extends Őshüllő {


    public Dínó(String nev, String faj, String élettér, boolean növényevő, double testhossz, int testtömeg){
        super(nev, faj, élettér, növényevő);
        this.testhossz = testhossz;
        this.testtömeg = testtömeg;
    }
}
