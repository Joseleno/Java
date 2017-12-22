package com.joseleno.java.prog;

import com.joseleno.java.hibernate.Rappel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    private static EntityManagerFactory factory;
             public static void main(String args[]) {

                 factory = Persistence.createEntityManagerFactory("JPAEXEMPLE");

                 Rappel rappel = new Rappel();
                 rappel.setTitre("Ir ao Detran");
                 rappel.setDescription("Ir ao detran realizar a transferencia do veiculo");

                 EntityManager ent = factory.createEntityManager();

                 try {
                     ent.getTransaction().begin();
                     ent.persist(rappel);
                     ent.getTransaction().commit();
                 }catch (Exception e){
                     ent.getTransaction().rollback();
                     System.out.println("Insert" + e.getMessage());
                 }
                 finally {
                     ent.close();
                 }
        }
}
