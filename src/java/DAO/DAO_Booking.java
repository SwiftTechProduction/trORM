package DAO;

import Entity.e_kamar;
import Entity.e_booking;
import Entity.e_pelanggan;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Iyos
 */
public class DAO_Booking 
{
    private final EntityManager em;
    private final EntityManagerFactory emf;

    public DAO_Booking() 
    {
        emf = Persistence.createEntityManagerFactory("trORMPU");
        em = emf.createEntityManager();
    }
    
    public void create(e_booking tb) 
    {
        em.getTransaction().begin();
        em.persist(tb);
        em.getTransaction().commit();
    }
    
    public void update(e_booking tb) 
    {
        em.getTransaction().begin();
        em.merge(tb);
        em.getTransaction().commit();
    }
    
    public void delete(e_booking tb) 
    {
        em.getTransaction().begin();
        em.remove(tb);
        em.getTransaction().commit();
    }
    
    public List<e_booking> getAll() 
    {
        String jpql = "SELECT a FROM tb_booking a ORDER BY a.id ASC";
        return (List<e_booking>) em.createQuery(jpql).getResultList();
    }
}
