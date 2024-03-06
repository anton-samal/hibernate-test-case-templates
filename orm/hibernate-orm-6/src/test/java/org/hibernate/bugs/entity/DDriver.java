package org.hibernate.bugs.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "D_DRIVER")
@PrimaryKeyJoinColumn(name = "D_DRIVER_SK")
public class DDriver extends Driver {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "B_DRIVER_FK")
    private BDriver bDriver;

    public DDriver() {
    }

    public BDriver getBDriver() {
        return this.bDriver;
    }

    public void setBDriver(BDriver bDriver) {
        this.bDriver = bDriver;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DDriver)) return false;
        final DDriver other = (DDriver) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$bDriver = this.getBDriver();
        final Object other$bDriver = other.getBDriver();
        if (this$bDriver == null ? other$bDriver != null : !this$bDriver.equals(other$bDriver)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DDriver;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $bDriver = this.getBDriver();
        result = result * PRIME + ($bDriver == null ? 43 : $bDriver.hashCode());
        return result;
    }

    public String toString() {
        return "DDriver(bDriver=" + this.getBDriver() + ")";
    }
}
