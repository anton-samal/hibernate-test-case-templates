package org.hibernate.bugs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company {
    @Id
    @Column(name = "COMPANY_SK")
    private long surrogateKey;

    public long getSurrogateKey() {
        return surrogateKey;
    }

    public void setSurrogateKey(final long surrogateKey) {
        this.surrogateKey = surrogateKey;
    }
}
