package org.hibernate.bugs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "DELIVERY_ADDRESS")
public class PDeliveryAddress extends DeliveryAddress<PDeliveryAddress> {

}
