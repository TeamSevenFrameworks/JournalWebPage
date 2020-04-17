package com.team.seven.journalpage.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author T440
 */
@Entity
@Table(name = "EXAMPLE")
@NamedQueries({
    @NamedQuery(name = "Example.findAll", query = "SELECT e FROM Example e"),
    @NamedQuery(name = "Example.findByExmpl", query = "SELECT e FROM Example e WHERE e.exmpl = :exmpl")})
public class Example implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "EXMPL")
    private String exmpl;

    public Example() {
    }

    public Example(String exmpl) {
        this.exmpl = exmpl;
    }

    public String getExmpl() {
        return exmpl;
    }

    public void setExmpl(String exmpl) {
        this.exmpl = exmpl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exmpl != null ? exmpl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Example)) {
            return false;
        }
        Example other = (Example) object;
        if ((this.exmpl == null && other.exmpl != null) || (this.exmpl != null && !this.exmpl.equals(other.exmpl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalpage.model.Example[ exmpl=" + exmpl + " ]";
    }
    
}
