package Obeserver;

/**
 * @author joseleno on 17/06/18
 */
public class DeuxiemeObserver implements Observer {
    @Override
    public void update(Observable observable) {
        int etat = ((ObservableConcret) observable).getEtat();
        System.out.println("L'état  dans le Deuxième Observer est "+ etat*20);
    }
}
