
public class MuuttuvatMuuttujat {

    public static void main(String[] args) {
        // MUUTA NÄITÄ:

        int kanojenLkm = 9000;
        double pekoninPaino = 0.1;

        // ÄLÄ MUUTA NÄITÄ:
        System.out.println("Kanoja:");
        System.out.println(kanojenLkm);
        System.out.println("Pekonia (kg):");
        System.out.println(pekoninPaino);
        System.out.println("");
        System.out.println("Tässä vielä tiivistelmä:");
        System.out.println(kanojenLkm);
        System.out.println(pekoninPaino);
        kanojenLkm = 3000;
        System.out.println("Kanoja jäljellä: " + kanojenLkm);
    }

}
