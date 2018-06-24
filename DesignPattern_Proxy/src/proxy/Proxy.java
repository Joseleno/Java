package proxy;

import couche.affaire.AffaireImp;
import couche.affaire.IAffaire;

public class Proxy implements IAffaire {

    private AffaireImp affaire;

    @Override
    public double calcule() {
        if (affaire == null) {
            affaire = new AffaireImp();
        }
        System.out.println("Overture d'une Transaction");
        double result;
        try {
            result = affaire.calcule();
            System.out.println("Commit");
        } catch (Exception e) {
            System.out.println("Rollback");
            throw (e);
        }
        System.out.println("Fermer la Transaction");
        return result;

    }
}
