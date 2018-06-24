import Obeserver.DeuxiemeObserver;
import Obeserver.ObservableConcret;
import Obeserver.PremierObserver;
import Obeserver.TroisiemeObserver;

/**
 * @author joseleno on 17/06/18
 */
public class Program {
    public static void main(String[] args) {
        ObservableConcret sujet = new ObservableConcret();
        PremierObserver premierObserver = new PremierObserver();
        DeuxiemeObserver deuxiemeObserver = new DeuxiemeObserver();
        TroisiemeObserver troisiemeObserver = new TroisiemeObserver();
        sujet.addObserver(premierObserver);
        sujet.addObserver(deuxiemeObserver);
        sujet.addObserver(troisiemeObserver);
        sujet.setEtat(10);
        sujet.setEtat(100);
        sujet.deleteObserver(deuxiemeObserver);
        sujet.setEtat(1000);

    }
}
