package Obeserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joseleno on 17/06/18
 */
public class ObservableConcret implements Observable{

    private int etat;

    private List<Observer> observerList = new ArrayList<>();

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observerList){
            obs.update(this);
        }
    }
}
