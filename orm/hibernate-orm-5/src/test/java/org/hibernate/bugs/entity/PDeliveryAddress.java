package org.hibernate.bugs.entity;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "DELIVERY_ADDRESS")
public class PDeliveryAddress extends DeliveryAddress<PDeliveryAddress> {

}
