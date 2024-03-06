package org.hibernate.bugs.entity;


import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class BaseAddress<T extends BaseAddress> {


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COUNTRY_FK")
    protected CountryEntity country;

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(final CountryEntity country) {
        this.country = country;
    }
}
