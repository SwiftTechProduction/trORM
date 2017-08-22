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
public class e_kamar implements Serializable 
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private String kode_kamar;
    
    @Column(nullable = false)
    private String nama_kamar;
    
    @Column(nullable = false)
    private String lantai_kamar;

    @Column(nullable = false)
    private String tipe_kamar;
    
    @Column(nullable = false)
    private String harga;
    
    @ManyToOne
    @JoinColumn(name = "id_booking", nullable = false)
    private e_booking e_booking;

    public String getKode_kamar() 
    {
        return kode_kamar;
    }

    public void setKode_kamar(String kode_kamar) 
    {
        this.kode_kamar = kode_kamar;
    }
    
    public e_booking getE_booking() 
    {
        return e_booking;
    }

    public void setE_booking(e_booking e_booking) 
    {
        this.e_booking = e_booking;
    }

    public String getNama_kamar() 
    {
        return nama_kamar;
    }

    public void setNama_kamar(String nama_kamar) 
    {
        this.nama_kamar = nama_kamar;
    }

    public String getLantai_kamar() 
    {
        return lantai_kamar;
    }

    public void setLantai_kamar(String lantai_kamar) 
    {
        this.lantai_kamar = lantai_kamar;
    }

    public String getTipe_kamar() 
    {
        return tipe_kamar;
    }

    public void setTipe_kamar(String tipe_kamar) 
    {
        this.tipe_kamar = tipe_kamar;
    }

    public String getHarga() 
    {
        return harga;
    }

    public void setHarga(String harga) 
    {
        this.harga = harga;
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
        if (!(object instanceof e_kamar)) 
        {
            return false;
        }
        e_kamar other = (e_kamar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Entity.e_kamar[ id=" + id + " ]";
    }
    
}
