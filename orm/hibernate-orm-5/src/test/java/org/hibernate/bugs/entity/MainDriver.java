package org.hibernate.bugs.entity;


import javax.persistence.*;

@Entity
@Table(name = "MAIN_DRIVER")
@PrimaryKeyJoinColumn(name = "MAIN_DRIVER_SK")
public abstract class MainDriver extends Driver {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COMPANY_FK")
    private Company company;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "B_A_FK")
    private BA ba;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "BI_A_FK")
    protected BiAHolder biAHolder;

    public Company getCompany() {
        return company;
    }

    public void setCompany(final Company company) {
        this.company = company;
    }

    public BA getBa() {
        return ba;
    }

    public void setBa(final BA ba) {
        this.ba = ba;
    }

    public BiAHolder getBiAHolder() {
        return biAHolder;
    }

    public void setBiAHolder(final BiAHolder biAHolder) {
        this.biAHolder = biAHolder;
    }
}
