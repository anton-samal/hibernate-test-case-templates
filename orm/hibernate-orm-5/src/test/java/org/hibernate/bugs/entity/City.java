package org.hibernate.bugs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City extends AbstractEntity {

    @Id
    @Column(name = "CITY_SK")
    private long surrogateKey;

    @Column(unique = true, nullable = false, updatable = false)
    private String id;

    protected City() {
    }

    public String id() {
        return id;
    }

}
