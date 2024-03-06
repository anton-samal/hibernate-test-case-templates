package org.hibernate.bugs.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "B_DRIVER")
@PrimaryKeyJoinColumn(name = "B_DRIVER_SK")
@SuppressWarnings("unused")
public class BDriver extends ADriver {

	public BDriver() {
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof BDriver)) return false;
		final BDriver other = (BDriver) o;
		if (!other.canEqual((Object) this)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof BDriver;
	}

	public int hashCode() {
		int result = 1;
		return result;
	}

	public String toString() {
		return "BDriver()";
	}
}
