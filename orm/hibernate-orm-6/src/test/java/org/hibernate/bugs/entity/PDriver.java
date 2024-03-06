package org.hibernate.bugs.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name="P_DRIVER")
@PrimaryKeyJoinColumn(name="P_DRIVER_SK")
public class PDriver extends MainDriver {
}
