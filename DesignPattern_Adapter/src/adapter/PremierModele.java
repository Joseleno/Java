package adapter;

/**
 * @author joseleno on 17/06/18
 */
public class PremierModele implements  Modele{
    @Override
    public void methode(int a, int b) {
        System.out.println("Le résultat Premier Modele: " + (a + b));
    }
}
