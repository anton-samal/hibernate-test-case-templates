package org.hibernate.bugs.entity;


import jakarta.persistence.*;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Person {

    @Id
    @Column(name = "PERSON_SK")
    private long sk;

    @OneToOne(mappedBy = "person", fetch = EAGER)
    protected Driver driver;

    public long getSk() {
        return sk;
    }

    public void setSk(final long sk) {
        this.sk = sk;
    }
}
