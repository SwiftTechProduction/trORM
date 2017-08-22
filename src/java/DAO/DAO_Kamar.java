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
public class DAO_Kamar 
{
    private final EntityManager em;
    private final EntityManagerFactory emf;

    public DAO_Kamar() 
    {
        emf = Persistence.createEntityManagerFactory("trORMPU");
        em = emf.createEntityManager();
    }
    
    public void create(e_kamar tb) 
    {
        em.getTransaction().begin();
        em.persist(tb);
        em.getTransaction().commit();
    }
    
    public void update(e_kamar tb) 
    {
        em.getTransaction().begin();
        em.merge(tb);
        em.getTransaction().commit();
    }
    
    public void delete(e_kamar tb) 
    {
        em.getTransaction().begin();
        em.remove(tb);
        em.getTransaction().commit();
    }
    
    public List<e_kamar> getAll() 
    {
        String jpql = "SELECT a FROM tb_kamar a ORDER BY a.id ASC";
        return (List<e_kamar>) em.createQuery(jpql).getResultList();
    }
}
