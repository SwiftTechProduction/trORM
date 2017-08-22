/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Iyos
 */
@Entity
public class e_booking implements Serializable 
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
    private String kode_pelanggan;
    
    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    private String harga;
    
    @Column(nullable = false)
    private String check_in;
    
    @Column(nullable = false)
    private String check_out;
    
    @OneToMany(mappedBy = "e_booking", cascade = CascadeType.ALL)
    private List<e_pelanggan> pelangganList;
    
    @OneToMany(mappedBy = "e_booking", cascade = CascadeType.ALL)
    private List<e_kamar> kamarList;
    
    public List<e_kamar> getKamarList() 
    {
        return kamarList;
    }

    public void setKamarList(List<e_kamar> kamarList) 
    {
        this.kamarList = kamarList;
    }

    public List<e_pelanggan> getPelangganList() 
    {
        return pelangganList;
    }

    public void setPelangganList(List<e_pelanggan> pelangganList) 
    {
        this.pelangganList = pelangganList;
    }
    
    public String getKode_kamar() 
    {
        return kode_kamar;
    }

    public void setKode_kamar(String kode_kamar) 
    {
        this.kode_kamar = kode_kamar;
    }

    public String getNama_kamar() 
    {
        return nama_kamar;
    }

    public void setNama_kamar(String nama_kamar) 
    {
        this.nama_kamar = nama_kamar;
    }

    public String getKode_pelanggan() 
    {
        return kode_pelanggan;
    }

    public void setKode_pelanggan(String kode_pelanggan) 
    {
        this.kode_pelanggan = kode_pelanggan;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getHarga()
    {
        return harga;
    }

    public void setHarga(String harga) 
    {
        this.harga = harga;
    }

    public String getCheck_in() 
    {
        return check_in;
    }

    public void setCheck_in(String check_in) 
    {
        this.check_in = check_in;
    }

    public String getCheck_out() 
    {
        return check_out;
    }

    public void setCheck_out(String check_out) 
    {
        this.check_out = check_out;
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
        if (!(object instanceof e_booking)) 
        {
            return false;
        }
        e_booking other = (e_booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Entity.e_booking[ id=" + id + " ]";
    }

}
