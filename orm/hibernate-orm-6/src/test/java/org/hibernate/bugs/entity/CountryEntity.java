package org.hibernate.bugs.entity;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Immutable
@Entity
@Table(name = "COUNTRY")
public class CountryEntity {

    @Id
    @Column(name = "COUNTRY_SK")
    private long countrySk;

    public long getCountrySk() {
        return countrySk;
    }

    public void setCountrySk(final long countrySk) {
        this.countrySk = countrySk;
    }
}
