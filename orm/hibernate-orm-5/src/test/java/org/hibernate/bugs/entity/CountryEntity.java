package org.hibernate.bugs.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


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
