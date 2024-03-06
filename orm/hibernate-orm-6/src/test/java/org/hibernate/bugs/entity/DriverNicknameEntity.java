package org.hibernate.bugs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
