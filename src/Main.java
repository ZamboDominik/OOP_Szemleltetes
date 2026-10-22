public class Main {
    public static void main(String[] args) {
        Allat[] allatkert = new Allat[2];
        allatkert[0] = new Kutya("Bodri", 3, "Német juhász");
        allatkert[1] = new Macska("Cirmi", 2, true);

        System.out.println("=== Állatkert Interaktív Bemutató ===\n");

        for (Allat allat : allatkert) {
            System.out.println("Állat neve: " + allat.getNev() + " (" + allat.getKor() + " éves)");

            allat.hangotAd();
            allat.alszik();

            if (allat instanceof Kutya) {
                ((Kutya) allat).csovaljaAFarkat();
            } else if (allat instanceof Macska) {
                ((Macska) allat).dorgolodik();
            }

            System.out.println("-----------------------------------");
        }
    }
}
