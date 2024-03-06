package org.hibernate.bugs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRIVER_NICKNAME")
public class DriverNicknameEntity {

    @Id
    @Column(name = "DRIVER_NICKNAME_SK")
    private long driverNicknameSK;

    public long getDriverNicknameSK() {
        return driverNicknameSK;
    }

    public void setDriverNicknameSK(long driverNicknameSK) {
        this.driverNicknameSK = driverNicknameSK;
    }

}
