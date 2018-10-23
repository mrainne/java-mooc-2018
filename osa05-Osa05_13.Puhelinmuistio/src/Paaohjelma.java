
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimiesi luokkien Henkilo ja Puhelinmuistio toimintaa
        Henkilo pekka = new Henkilo("Pekka Mikkola", "040-123123");
        System.out.println(pekka.getNimi());
        System.out.println(pekka.getNumero());

        System.out.println(pekka);

        pekka.vaihdaNumeroa("050-333444");
        System.out.println(pekka);
        
        Puhelinmuistio muistio = new Puhelinmuistio();
        muistio.lisaa("Pekka Mikkola", "040-123123");
        muistio.lisaa("Antti Laaksonen", "045-456123");
        muistio.lisaa("Juhana Laurinharju", "050-222333");

        muistio.tulostaKaikki();
        
        String numero = muistio.haeNumero("Pekka Mikkola");
        System.out.println(numero);

        numero = muistio.haeNumero("Martti Tienari");
        System.out.println(numero);
    }
}
