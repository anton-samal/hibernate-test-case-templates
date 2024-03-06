package org.hibernate.bugs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
