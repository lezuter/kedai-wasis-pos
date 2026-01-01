/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkpwasis;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author amel
 */
@Entity
@Table(name = "barang", catalog = "wasis", schema = "")
@NamedQueries({
    @NamedQuery(name = "Barang_1.findAll", query = "SELECT b FROM Barang_1 b")
    , @NamedQuery(name = "Barang_1.findByKdBrg", query = "SELECT b FROM Barang_1 b WHERE b.kdBrg = :kdBrg")
    , @NamedQuery(name = "Barang_1.findByNmBrg", query = "SELECT b FROM Barang_1 b WHERE b.nmBrg = :nmBrg")
    , @NamedQuery(name = "Barang_1.findByJnsBrg", query = "SELECT b FROM Barang_1 b WHERE b.jnsBrg = :jnsBrg")
    , @NamedQuery(name = "Barang_1.findByHrg", query = "SELECT b FROM Barang_1 b WHERE b.hrg = :hrg")
    , @NamedQuery(name = "Barang_1.findByStok", query = "SELECT b FROM Barang_1 b WHERE b.stok = :stok")
    , @NamedQuery(name = "Barang_1.findByMinStok", query = "SELECT b FROM Barang_1 b WHERE b.minStok = :minStok")})
public class Barang_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_brg")
    private String kdBrg;
    @Basic(optional = false)
    @Column(name = "nm_brg")
    private String nmBrg;
    @Basic(optional = false)
    @Column(name = "jns_brg")
    private String jnsBrg;
    @Basic(optional = false)
    @Column(name = "hrg")
    private int hrg;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;
    @Basic(optional = false)
    @Column(name = "min_stok")
    private int minStok;

    public Barang_1() {
    }

    public Barang_1(String kdBrg) {
        this.kdBrg = kdBrg;
    }

    public Barang_1(String kdBrg, String nmBrg, String jnsBrg, int hrg, int stok, int minStok) {
        this.kdBrg = kdBrg;
        this.nmBrg = nmBrg;
        this.jnsBrg = jnsBrg;
        this.hrg = hrg;
        this.stok = stok;
        this.minStok = minStok;
    }

    public String getKdBrg() {
        return kdBrg;
    }

    public void setKdBrg(String kdBrg) {
        String oldKdBrg = this.kdBrg;
        this.kdBrg = kdBrg;
        changeSupport.firePropertyChange("kdBrg", oldKdBrg, kdBrg);
    }

    public String getNmBrg() {
        return nmBrg;
    }

    public void setNmBrg(String nmBrg) {
        String oldNmBrg = this.nmBrg;
        this.nmBrg = nmBrg;
        changeSupport.firePropertyChange("nmBrg", oldNmBrg, nmBrg);
    }

    public String getJnsBrg() {
        return jnsBrg;
    }

    public void setJnsBrg(String jnsBrg) {
        String oldJnsBrg = this.jnsBrg;
        this.jnsBrg = jnsBrg;
        changeSupport.firePropertyChange("jnsBrg", oldJnsBrg, jnsBrg);
    }

    public int getHrg() {
        return hrg;
    }

    public void setHrg(int hrg) {
        int oldHrg = this.hrg;
        this.hrg = hrg;
        changeSupport.firePropertyChange("hrg", oldHrg, hrg);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    public int getMinStok() {
        return minStok;
    }

    public void setMinStok(int minStok) {
        int oldMinStok = this.minStok;
        this.minStok = minStok;
        changeSupport.firePropertyChange("minStok", oldMinStok, minStok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdBrg != null ? kdBrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang_1)) {
            return false;
        }
        Barang_1 other = (Barang_1) object;
        if ((this.kdBrg == null && other.kdBrg != null) || (this.kdBrg != null && !this.kdBrg.equals(other.kdBrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kkpwasis.Barang_1[ kdBrg=" + kdBrg + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
