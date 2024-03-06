package org.hibernate.bugs.entity;


import jakarta.persistence.Entity;


@Entity
public class BPerson extends Person {
	public BPerson() {
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof BPerson)) return false;
		final BPerson other = (BPerson) o;
		if (!other.canEqual((Object) this)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof BPerson;
	}

	public int hashCode() {
		int result = 1;
		return result;
	}

	public String toString() {
		return "BPerson()";
	}
}
