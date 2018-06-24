import adapter.AdapterComposition;
import adapter.AdapterHeritage;
import adapter.Modele;
import adapter.PremierModele;

import javax.jws.WebParam;

/**
 * @author joseleno on 17/06/18
 */
public class Program {
    public static void main(String[] args) {
        Modele modele = new PremierModele();
        modele.methode(5, 5);

        Modele adapterHeritage = new AdapterHeritage();
        adapterHeritage.methode(5,5);


        Modele adapterComposition = new AdapterComposition();
        adapterComposition.methode(5,5);

    }
}
