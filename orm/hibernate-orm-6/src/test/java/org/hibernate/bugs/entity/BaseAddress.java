package org.hibernate.bugs.entity;


import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;


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
