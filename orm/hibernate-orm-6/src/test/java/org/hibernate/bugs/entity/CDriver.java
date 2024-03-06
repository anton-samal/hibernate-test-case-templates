package org.hibernate.bugs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "C_DRIVER")
@PrimaryKeyJoinColumn(name = "C_DRIVER_SK")
public class CDriver extends ADriver {

	public CDriver() {
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof CDriver)) return false;
		final CDriver other = (CDriver) o;
		if (!other.canEqual((Object) this)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CDriver;
	}

	public int hashCode() {
		int result = 1;
		return result;
	}

	public String toString() {
		return "CDriver()";
	}
}
