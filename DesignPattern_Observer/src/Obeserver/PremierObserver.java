package Obeserver;

/**
 * @author joseleno on 17/06/18
 */
public class PremierObserver implements Observer {
    @Override
    public void update(Observable observable) {
        int etat = ((ObservableConcret) observable).getEtat();
        System.out.println("L'état dans le Premier Observer est "+ etat*10);
    }
}
