package adapter;

import extension.AdapterImp;

/**
 * @author joseleno on 17/06/18
 */
public class AdapterHeritage extends AdapterImp implements  Modele{
    @Override
    public void methode(int a, int b) {
        int resultat = methodeB( a,  b);
        methodeC(resultat);

    }
}
