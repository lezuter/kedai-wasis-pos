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
@Table(name = "bahan_menu", catalog = "wasis", schema = "")
@NamedQueries({
    @NamedQuery(name = "BahanMenu.findAll", query = "SELECT b FROM BahanMenu b")
    , @NamedQuery(name = "BahanMenu.findByKdBhnmn", query = "SELECT b FROM BahanMenu b WHERE b.kdBhnmn = :kdBhnmn")
    , @NamedQuery(name = "BahanMenu.findByNmBhnmn", query = "SELECT b FROM BahanMenu b WHERE b.nmBhnmn = :nmBhnmn")
    , @NamedQuery(name = "BahanMenu.findByStok", query = "SELECT b FROM BahanMenu b WHERE b.stok = :stok")})
public class BahanMenu implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_bhnmn")
    private String kdBhnmn;
    @Basic(optional = false)
    @Column(name = "nm_bhnmn")
    private String nmBhnmn;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public BahanMenu() {
    }

    public BahanMenu(String kdBhnmn) {
        this.kdBhnmn = kdBhnmn;
    }

    public BahanMenu(String kdBhnmn, String nmBhnmn, int stok) {
        this.kdBhnmn = kdBhnmn;
        this.nmBhnmn = nmBhnmn;
        this.stok = stok;
    }

    public String getKdBhnmn() {
        return kdBhnmn;
    }

    public void setKdBhnmn(String kdBhnmn) {
        String oldKdBhnmn = this.kdBhnmn;
        this.kdBhnmn = kdBhnmn;
        changeSupport.firePropertyChange("kdBhnmn", oldKdBhnmn, kdBhnmn);
    }

    public String getNmBhnmn() {
        return nmBhnmn;
    }

    public void setNmBhnmn(String nmBhnmn) {
        String oldNmBhnmn = this.nmBhnmn;
        this.nmBhnmn = nmBhnmn;
        changeSupport.firePropertyChange("nmBhnmn", oldNmBhnmn, nmBhnmn);
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
        hash += (kdBhnmn != null ? kdBhnmn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BahanMenu)) {
            return false;
        }
        BahanMenu other = (BahanMenu) object;
        if ((this.kdBhnmn == null && other.kdBhnmn != null) || (this.kdBhnmn != null && !this.kdBhnmn.equals(other.kdBhnmn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kkpwasis.BahanMenu[ kdBhnmn=" + kdBhnmn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
