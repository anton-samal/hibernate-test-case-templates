package org.hibernate.bugs.entity;


import javax.persistence.*;

@Entity
@Table(name = "DELIVERY_ADDRESS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class DeliveryAddress<T extends DeliveryAddress> extends BaseAddress<T> {

    @Id
    @Column(name = "DELIVERY_ADDRESS_SK")
    private long surrogateKey;

}
