package org.hibernate.bugs.entity;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="P_DRIVER")
@PrimaryKeyJoinColumn(name="P_DRIVER_SK")
public class PDriver extends MainDriver {
}
