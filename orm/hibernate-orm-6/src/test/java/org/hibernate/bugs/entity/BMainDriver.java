package org.hibernate.bugs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "B_MAIN_DRIVER")
@PrimaryKeyJoinColumn(name = "B_MAIN_DRIVER_SK")
public class BMainDriver extends MainDriver {

}
