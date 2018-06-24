package Obeserver;

/**
 * @author joseleno on 17/06/18
 */
public class TroisiemeObserver implements Observer {
    @Override
    public void update(Observable observable) {
        int etat = ((ObservableConcret) observable).getEtat();
        System.out.println("L'état dans le Troisième Observer est "+ etat*30);
    }
}
