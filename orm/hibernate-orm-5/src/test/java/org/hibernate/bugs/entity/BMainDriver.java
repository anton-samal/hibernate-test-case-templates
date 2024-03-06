package org.hibernate.bugs.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "B_MAIN_DRIVER")
@PrimaryKeyJoinColumn(name = "B_MAIN_DRIVER_SK")
public class BMainDriver extends MainDriver {

}
