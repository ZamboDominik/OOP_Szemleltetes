public class Macska extends Allat {
    private boolean bentiLako;

    public Macska(String nev, int kor, boolean bentiLako) {
        super(nev, kor);
        this.bentiLako = bentiLako;
    }

    @Override
    public void hangotAd() {
        System.out.println(getNev() + " (Macska): Miau! Miau!");
    }

    public void dorgolodik() {
        System.out.println(getNev() + " éppen dörgölődik a lábadhoz.");
    }
}
