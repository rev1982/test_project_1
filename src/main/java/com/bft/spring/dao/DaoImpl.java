package com.bft.spring.dao;

/**
 * Created by rev on 18.12.2017.
 */
import java.util.List;

import com.bft.spring.model.DomainEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository
public class DaoImpl extends AbstractDao{

    public void save(DomainEntity domainEntity) {
        persist(domainEntity);
    }

    public void saveOrUpdate(DomainEntity domainEntity) {
        saveOrUpdateEntity(domainEntity);
    }

    @SuppressWarnings("unchecked")
    public List<DomainEntity> findAll(Class classs) {
        Criteria criteria = getSession().createCriteria(classs);
        return (List<DomainEntity>) criteria.list();
    }

    public DomainEntity findByName(String name, Class classs){
        Criteria criteria = getSession().createCriteria(classs);
        criteria.add(Restrictions.eq("name", name));
        return (DomainEntity) criteria.uniqueResult();
    }

    public void update(DomainEntity domainEntity){
        getSession().update(domainEntity);
    }

}