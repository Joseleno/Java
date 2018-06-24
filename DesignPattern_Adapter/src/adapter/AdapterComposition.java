package adapter;

import extension.AdapterImp;

/**
 * @author joseleno on 17/06/18
 */
public class AdapterComposition  implements Modele{
    private AdapterImp adapterImp = new AdapterImp();
    @Override
    public void methode(int a, int b) {
        int resultat = adapterImp.methodeB(5,5);
        adapterImp.methodeC(resultat);
    }
}
