package com.bft.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rev on 18.12.2017.
 */
@Entity
@Table(name="SUBDIVISION_PU")
public class SubdivisionPU extends DomainEntity<Long> {
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
