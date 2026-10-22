public class Kutya extends Allat {
    private String fajta;

    public Kutya(String nev, int kor, String fajta) {
        super(nev, kor);
        this.fajta = fajta;
    }

    @Override
    public void hangotAd() {
        System.out.println(getNev() + " (Kutya): Vau-vau!");
    }

    public void csovaljaAFarkat() {
        System.out.println(getNev() + " csóválja a farkát örömében.");
    }
}
