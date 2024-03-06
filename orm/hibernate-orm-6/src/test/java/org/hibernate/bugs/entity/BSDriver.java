package org.hibernate.bugs.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "B_S_DRIVER")
@PrimaryKeyJoinColumn(name = "B_S_DRIVER_SK")
public class BSDriver extends Driver {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "B_MAIN_DRIVER_FK")
    private BMainDriver bMainDriver;

    public BMainDriver getbMainDriver() {
        return bMainDriver;
    }

    public void setbMainDriver(final BMainDriver bMainDriver) {
        this.bMainDriver = bMainDriver;
    }
}
