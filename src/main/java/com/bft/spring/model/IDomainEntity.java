package com.bft.spring.model;

/**
 * Created by rev on 18.12.2017.
 */
import java.io.Serializable;


public interface IDomainEntity<T extends Serializable> {

    public static final String ID = "ID";

    public T getId();
}

