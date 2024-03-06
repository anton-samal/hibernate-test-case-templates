package org.hibernate.bugs.entity;

import javax.persistence.*;


@Entity
@Table(name = "A_DRIVER")
@PrimaryKeyJoinColumn(name = "A_DRIVER_SK")
public abstract class ADriver extends Driver {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CITY_FK")
	private City city;

	public ADriver() {
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ADriver)) return false;
		final ADriver other = (ADriver) o;
		if (!other.canEqual((Object) this)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ADriver;
	}

	public int hashCode() {
		int result = 1;
		return result;
	}

	public String toString() {
		return "ADriver()";
	}
}
