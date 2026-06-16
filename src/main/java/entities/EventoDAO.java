package entities;
import jakarta.persistence.EntityManager;

public class EventoDAO {
    private final EntityManager entityManager;

    //ho creato il costruttore che passo nel main, eventodao mi permetterà di manipolare i dati del db
    // cioè sto dicendo a EVENTODAO che per poter fare il suo lavoro col db
    //deve usare l'entitymanager che gli ho passato io nel main quando ho creato l'oggetto new eventodao.
    public EventoDAO(EntityManager entityManager) {
        this.entityManager=entityManager;
    }
}
