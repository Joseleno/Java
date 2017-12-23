package com.joseleno.java.prog;

import com.joseleno.java.hibernate.Rappel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class Main {

    private static EntityManagerFactory factory;

    public static void main(String args[]) {

        factory = Persistence.createEntityManagerFactory("dbrappel");

        Rappel rappel = new Rappel();

        // rappel.setTitre("Busca Por Nome");
        // rappel.setDescription("Ir ao detran realizar a transferencia do veiculo -----");


        EntityManager ent = factory.createEntityManager();

/*
        try {

            ent.getTransaction().begin();
            ent.persist(rappel);
            ent.getTransaction().commit();
        } catch (Exception e) {
            ent.getTransaction().rollback();
            System.out.println("Insert" + e.getMessage());
        } finally {
            ent.close();
        }

*/
        List<Rappel> rappelList = null;


        try {
            if (!ent.isOpen()) {
                ent = factory.createEntityManager();
            }
            ent.getTransaction().begin();
            rappelList = ent.createQuery("from Rappel").getResultList();
        } catch (Exception e) {
            System.out.println("LIST ALL: " + e.getMessage());
        } finally {
            ent.close();
        }

        if (rappelList != null) {
            rappelList.forEach(System.out::println);
        }

        try {
            if (!ent.isOpen()) {
                ent = factory.createEntityManager();
            }
            rappel = ent.find(Rappel.class, 1L);
        } finally {
            ent.close();

        }

        System.out.println(rappel + "teste 1");

        try {
            if (!ent.isOpen()) {
                ent = factory.createEntityManager();
            }
            rappelList.clear();
            rappelList = ent.createQuery("from Rappel r where r.titre LIKE '%Por%'").getResultList();
        } catch (Exception e) {
            System.out.println("LIST ALL: " + e.getMessage());
        } finally {
            ent.close();
        }

        if (rappelList != null) {
            rappelList.forEach(System.out::println);
        }


        try {
            if (!ent.isOpen()) {
                ent = factory.createEntityManager();
            }

            rappel = ent.find(Rappel.class, 1L);
            rappel.setTitre("acheter la viande");
            rappel.setDescription("samendi, 10h22");


            ent.getTransaction().begin();
            ent.merge(rappel);
            ent.getTransaction().commit();
        } catch (Exception e) {
            ent.getTransaction().rollback();

            System.out.println("UPDATE: " + e.getMessage());
        } finally {
            ent.close();
        }

        try {
            if (!ent.isOpen()) {
                ent = factory.createEntityManager();
            }
            ent.getTransaction().begin();
            rappel = ent.find(Rappel.class, 1l);
            ent.remove(rappel);
            ent.getTransaction().commit();
        } catch (Exception e) {
            ent.getTransaction().rollback();

            System.out.println("DELETE: " + e.getMessage());
        } finally {
            ent.close();
        }

    }
}
