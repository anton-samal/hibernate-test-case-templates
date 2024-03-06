package org.hibernate.bugs.entity;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "C_PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CPerson {
    @Id
    @Column(name = "C_PERSON_SK")
    private long surrogateKey;

    @OneToMany(mappedBy = "cPerson", fetch = EAGER, cascade = CascadeType.ALL)
    protected List<CPersonDriver> cPersonDrivers;


    public long getSurrogateKey() {
        return surrogateKey;
    }

    public List<CPersonDriver> getcPersonDrivers() {
        return cPersonDrivers;
    }

    public void setcPersonDrivers(List<CPersonDriver> cPersonDrivers) {
        this.cPersonDrivers = cPersonDrivers;
    }
}
