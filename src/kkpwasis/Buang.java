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
@Table(name = "buang", catalog = "wasis", schema = "")
@NamedQueries({
    @NamedQuery(name = "Buang.findAll", query = "SELECT b FROM Buang b")
    , @NamedQuery(name = "Buang.findByKdBhn", query = "SELECT b FROM Buang b WHERE b.kdBhn = :kdBhn")
    , @NamedQuery(name = "Buang.findByNmBhn", query = "SELECT b FROM Buang b WHERE b.nmBhn = :nmBhn")
    , @NamedQuery(name = "Buang.findByStok", query = "SELECT b FROM Buang b WHERE b.stok = :stok")})
public class Buang implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_bhn")
    private String kdBhn;
    @Basic(optional = false)
    @Column(name = "nm_bhn")
    private String nmBhn;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public Buang() {
    }

    public Buang(String kdBhn) {
        this.kdBhn = kdBhn;
    }

    public Buang(String kdBhn, String nmBhn, int stok) {
        this.kdBhn = kdBhn;
        this.nmBhn = nmBhn;
        this.stok = stok;
    }

    public String getKdBhn() {
        return kdBhn;
    }

    public void setKdBhn(String kdBhn) {
        String oldKdBhn = this.kdBhn;
        this.kdBhn = kdBhn;
        changeSupport.firePropertyChange("kdBhn", oldKdBhn, kdBhn);
    }

    public String getNmBhn() {
        return nmBhn;
    }

    public void setNmBhn(String nmBhn) {
        String oldNmBhn = this.nmBhn;
        this.nmBhn = nmBhn;
        changeSupport.firePropertyChange("nmBhn", oldNmBhn, nmBhn);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdBhn != null ? kdBhn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buang)) {
            return false;
        }
        Buang other = (Buang) object;
        if ((this.kdBhn == null && other.kdBhn != null) || (this.kdBhn != null && !this.kdBhn.equals(other.kdBhn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kkpwasis.Buang[ kdBhn=" + kdBhn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
