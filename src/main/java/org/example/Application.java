package org.example;
import entities.EventoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    //nel main mi apro e do' il via alle operazioni che deve fare Entity Manager
    //Prelevo dal persistence il l'unitname di riferimento per il DB
    private static final EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("progetto_jpa");

    public static void main(String[] args) {
        //
EntityManager em=entityManagerFactory.createEntityManager();

//creo oggetto new dao e gli passo l'entitymanager

       EventoDAO eventoDAO=new EventoDAO(em);  //ora ho collegato eventodao e sa cosa fare perchè gli ho passao l'EntityM.













    }
}