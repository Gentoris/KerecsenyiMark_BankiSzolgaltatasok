package hu.petrik.bankiszolgatatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos t1= new Tulajdonos("Bud Spencer");
        Tulajdonos t2= new Tulajdonos("Terence Hill");


        Bank b1 = new Bank();
        b1.szamlaNyitas(t1,1100).befizet(2500);
        b1.szamlaNyitas(t2,440);
        b1.szamlaNyitas(t1,0).befizet(3450);

        System.out.println(b1.getOsszHitelKeret());
        System.out.println(b1.getLegnagyobbEgyenleguSzamla(t1));
        System.out.println(b1.getOsszEgyenleg(t1));




    }
}
