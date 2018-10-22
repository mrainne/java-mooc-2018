
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
        int sentit = lisattava.sentit() + senttia;
        int eurot = lisattava.eurot() + euroa;
        if (sentit >= 100) {
            eurot++;
            sentit -= 100;
        }
        return new Raha(eurot, sentit);
    }
    
    public boolean vahemman(Raha verrattava) {
        return (100 * euroa + senttia < 100 * verrattava.eurot() + verrattava.sentit());
    }
    
    public Raha miinus(Raha vahentaja) {
        int sentit = senttia - vahentaja.sentit();
        int eurot = euroa - vahentaja.eurot();
        
        if (sentit < 0) {
            eurot--;
            sentit += 100;
        }
        
        if (eurot < 0) {
            sentit = 0;
            eurot = 0;
        }
        
        return new Raha(eurot, sentit);
    }
}
