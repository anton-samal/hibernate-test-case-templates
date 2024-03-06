package org.hibernate.bugs.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "B_A")
public class BA {

    @Id
    @Column(name = "B_A_SK")
    private long surrogateKey;

    public long getSurrogateKey() {
        return surrogateKey;
    }

    public void setSurrogateKey(final long surrogateKey) {
        this.surrogateKey = surrogateKey;
    }
}
