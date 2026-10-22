public abstract class Allat {
    // 1.Encapsulation: privát adattagok
    private String nev;
    private int kor;

    // Konstruktor
    public Allat(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    // Getterek és Setterek
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    // 2. Absztrakció: A leszármazottaknak kötelező megvalósítaniuk saját logikával
    public abstract void hangotAd();

    // Közös metódus, amit minden állat örököl
    public void alszik() {
        System.out.println(nev + " most alszik... Zzz...");
    }
}
