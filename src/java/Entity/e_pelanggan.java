package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lukas
 */
@Entity
public class e_pelanggan implements Serializable 
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private String kode_pelanggan;
    
    @Column(nullable = false)
    private String nama;
    
    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false)
    private String no_telepon;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "id_booking", nullable = false)
    private e_booking e_booking;

    public String getKode_pelanggan() 
    {
        return kode_pelanggan;
    }

    public void setKode_pelanggan(String kode_pelanggan) 
    {
        this.kode_pelanggan = kode_pelanggan;
    }
    
    public e_booking getE_booking() 
    {
        return e_booking;
    }

    public void setE_booking(e_booking e_booking) 
    {
        this.e_booking = e_booking;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getAlamat() 
    {
        return alamat;
    }

    public void setAlamat(String alamat) 
    {
        this.alamat = alamat;
    }

    public String getNo_telepon() 
    {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) 
    {
        this.no_telepon = no_telepon;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    @Override
    public int hashCode() 
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) 
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof e_pelanggan)) 
        {
            return false;
        }
        e_pelanggan other = (e_pelanggan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Entity.e_pelanggan[ id=" + id + " ]";
    }
    
}
