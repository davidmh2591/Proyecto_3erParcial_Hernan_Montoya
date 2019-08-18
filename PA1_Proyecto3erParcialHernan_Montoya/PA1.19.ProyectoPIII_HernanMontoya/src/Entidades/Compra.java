/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose David
 */
@Entity
@Table(name = "compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c")
    , @NamedQuery(name = "Compra.findByCompraid", query = "SELECT c FROM Compra c WHERE c.compraid = :compraid")
    , @NamedQuery(name = "Compra.findByUsuario", query = "SELECT c FROM Compra c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "Compra.findById", query = "SELECT c FROM Compra c WHERE c.id = :id")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMPRAID")
    private Integer compraid;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private int usuario;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;

    public Compra() {
    }

    public Compra(Integer compraid) {
        this.compraid = compraid;
    }

    public Compra(Integer compraid, int usuario, int id) {
        this.compraid = compraid;
        this.usuario = usuario;
        this.id = id;
    }

    public Integer getCompraid() {
        return compraid;
    }

    public void setCompraid(Integer compraid) {
        this.compraid = compraid;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraid != null ? compraid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.compraid == null && other.compraid != null) || (this.compraid != null && !this.compraid.equals(other.compraid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Compra[ compraid=" + compraid + " ]";
    }
    
}
