package org.hibernate.bugs.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public abstract class AbstractEntity {

    @Column(name = "ID")
    private final String id = UUID.randomUUID().toString();

    public AbstractEntity() {
    }

    public String id() {
        return id;
    }

    public String getId() {
        return this.id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AbstractEntity)) return false;
        final AbstractEntity other = (AbstractEntity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AbstractEntity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    public String toString() {
        return "AbstractEntity(id=" + this.getId() + ")";
    }
}
