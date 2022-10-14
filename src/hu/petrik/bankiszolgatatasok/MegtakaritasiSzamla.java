package hu.petrik.bankiszolgatatasok;

public abstract class MegtakaritasiSzamla extends Szamla {

    private double kamat;
    public double alapKamat;

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg){

    }

    public void kamatJovairas(){

    }
}
