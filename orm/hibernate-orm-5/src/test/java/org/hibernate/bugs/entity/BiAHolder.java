package org.hibernate.bugs.entity;

import javax.persistence.*;

@Entity
@Table(name = "BI_A")
public class BiAHolder {

    @Embedded
    private BiA biA;

    @Id
    @Column(name = "BI_A_SK")
    private long surrogateKey;

    public BiA getBiA() {
        return biA;
    }

    public void setBiA(final BiA biA) {
        this.biA = biA;
    }

    public long getSurrogateKey() {
        return surrogateKey;
    }

    public void setSurrogateKey(final long surrogateKey) {
        this.surrogateKey = surrogateKey;
    }
}
