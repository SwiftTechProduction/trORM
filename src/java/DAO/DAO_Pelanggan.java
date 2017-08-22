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
public class DAO_Pelanggan 
{
    private final EntityManager em;
    private final EntityManagerFactory emf;

    public DAO_Pelanggan() 
    {
        emf = Persistence.createEntityManagerFactory("trORMPU");
        em = emf.createEntityManager();
    }
    
    public void create(e_pelanggan tb) 
    {
        em.getTransaction().begin();
        em.persist(tb);
        em.getTransaction().commit();
    }
    
    public void update(e_pelanggan tb) 
    {
        em.getTransaction().begin();
        em.merge(tb);
        em.getTransaction().commit();
    }
    
    public void delete(e_pelanggan tb) 
    {
        em.getTransaction().begin();
        em.remove(tb);
        em.getTransaction().commit();
    }
    
    public List<e_pelanggan> getAll() 
    {
        String jpql = "SELECT a FROM tb_pelanggan a ORDER BY a.id ASC";
        return (List<e_pelanggan>) em.createQuery(jpql).getResultList();
    }
}
