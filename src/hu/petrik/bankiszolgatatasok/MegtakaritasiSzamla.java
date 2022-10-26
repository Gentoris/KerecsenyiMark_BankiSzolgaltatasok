package hu.petrik.bankiszolgatatasok;

public class MegtakaritasiSzamla extends Szamla {

    private double kamat;
    public static double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos){
        super(tulajdonos);
        kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }


    public boolean kivesz(int osszeg){
        if (aktualisEgyenleg - osszeg >= 0){
            aktualisEgyenleg =- osszeg;
            return true;
        } else {
            return false;
        }
    }

    public void kamatJovairas(){
        aktualisEgyenleg += (int) (aktualisEgyenleg * kamat);
    }
}
