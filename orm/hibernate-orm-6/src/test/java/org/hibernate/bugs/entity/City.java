package org.hibernate.bugs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
