package couche.presentation;

import couche.affaire.IAffaire;
import proxy.Proxy;

/**
 * @author joseleno on 17/06/18
 */
public class Client {
    private IAffaire affaire = new Proxy();
public  Client(){
    System.out.println(affaire.calcule());
}
    public static void main(String[] args) {
        new Client();
    }

}
