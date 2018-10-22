
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        Raha a = new Raha(10,0);
        Raha b = new Raha(5,0);

        Raha c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "a:n langan päähän"
        //       vanha a:n langan päässä ollut 10 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e    
    
        Raha d = new Raha(10, 0);
        Raha e = new Raha(3, 0);
        Raha f = new Raha(5, 0);

        System.out.println(d.vahemman(e));  // false
        System.out.println(e.vahemman(f));  // true
    
        Raha g = new Raha(10, 0);
        Raha h = new Raha(3, 50);
        Raha i = g.miinus(h);

        System.out.println(g);  // 10.00e
        System.out.println(h);  // 3.50e
        System.out.println(i);  // 6.50e

        i = i.miinus(g);        // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "c:n langan päähän"
        //       vanha c:n langan päässä ollut 6.5 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(g);  // 10.00e
        System.out.println(h);  // 3.50e
        System.out.println(i);  // 0.00e
    }
}
