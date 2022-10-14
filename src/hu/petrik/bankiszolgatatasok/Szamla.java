package hu.petrik.bankiszolgatatasok;

public abstract class Szamla extends BankiSzolgaltatas{
    protected int aktualisEgyenleg;


    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){

    }

    public boolean kivesz(int osszeg){

    }

    public Kartya ujKartya(String kartyaszam){

    }
}
