package org.hibernate.bugs.entity;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "PERSON_DRIVER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CPersonDriver {
    @Id
    @Column(name = "PERSON_DRIVER_SK")
    private long surrogateKey;

    @ManyToOne(fetch = EAGER, optional = false)
    @JoinColumn(name = "C_PERSON_FK", referencedColumnName = "C_PERSON_SK")
    protected CPerson cPerson;

    @JoinColumn(name = "DRIVER_FK", referencedColumnName = "DRIVER_SK")
    @OneToOne(fetch = EAGER)
    protected Driver driver;

    public long getSurrogateKey() {
        return surrogateKey;
    }

    public CPerson getcPerson() {
        return cPerson;
    }

    public void setcPerson(CPerson cPerson) {
        this.cPerson = cPerson;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
