package com.bft.spring.model;

/**
 * Created by rev on 18.12.2017.
 */


import com.google.common.base.Objects;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class DomainEntity<T extends Serializable> implements Serializable, IDomainEntity<T> {
    @Id
    @SequenceGenerator(name = "idSeq", sequenceName = "ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeq")
    protected T id;

    public T getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DomainEntity that = (DomainEntity) o;
        return (id != null) ? id.equals(that.getId()) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + getId() + "]";
    }

}
