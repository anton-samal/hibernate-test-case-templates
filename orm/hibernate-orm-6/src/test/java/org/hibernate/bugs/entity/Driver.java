package org.hibernate.bugs.entity;


import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "DRIVER")
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class Driver {

	@Id
	@Column(name = "DRIVER_SK")
	private long surrogateKey;

	@OneToMany(cascade = CascadeType.ALL, fetch = EAGER, orphanRemoval = true)
	@JoinColumn(name = "DRIVER_FK", referencedColumnName = "DRIVER_SK")
	private Set<DriverNicknameEntity> driverNicknameEntities;

	@OneToMany(cascade = CascadeType.ALL, fetch = LAZY, orphanRemoval = true)
	@JoinColumn(name = "DRIVER_FK", referencedColumnName = "DRIVER_SK")
	private List<DeliveryAddress> deliveryAddresses;

	@OneToOne(cascade = CascadeType.ALL, fetch = EAGER)
	@JoinColumn(name = "DEFAULT_DELIVERY_ADDRESS", unique = true)
	private DeliveryAddress deafultDeliveryAddress;


	@OneToOne(fetch = EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_FK")
	protected Person person;

	@OneToOne(fetch = EAGER)
	@JoinColumn(name = "PERSON_DRIVER_FK")
	private CPersonDriver cPersonDriver;

	public long getSurrogateKey() {
		return surrogateKey;
	}

	public void setSurrogateKey(final long surrogateKey) {
		this.surrogateKey = surrogateKey;
	}

	public Set<DriverNicknameEntity> getDriverNicknameEntities() {
		return driverNicknameEntities;
	}

	public void setDriverNicknameEntities(final Set<DriverNicknameEntity> driverNicknameEntities) {
		this.driverNicknameEntities = driverNicknameEntities;
	}

	public List<DeliveryAddress> getDeliveryAddresses() {
		return deliveryAddresses;
	}

	public void setDeliveryAddresses(final List<DeliveryAddress> deliveryAddresses) {
		this.deliveryAddresses = deliveryAddresses;
	}

	public DeliveryAddress getDeafultDeliveryAddress() {
		return deafultDeliveryAddress;
	}

	public void setDeafultDeliveryAddress(final DeliveryAddress deafultDeliveryAddress) {
		this.deafultDeliveryAddress = deafultDeliveryAddress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public CPersonDriver getcPersonDriver() {
		return cPersonDriver;
	}

	public void setcPersonDriver(final CPersonDriver cPersonDriver) {
		this.cPersonDriver = cPersonDriver;
	}
}

