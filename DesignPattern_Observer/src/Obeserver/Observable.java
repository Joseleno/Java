package Obeserver;

/**
 * @author joseleno on 17/06/18
 */
public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
