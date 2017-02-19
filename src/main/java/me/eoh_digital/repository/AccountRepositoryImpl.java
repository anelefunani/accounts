package me.eoh_digital.repository;

import me.eoh_digital.model.AccountEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 2017/02/14.
 */

@Repository
@Transactional
public class AccountRepositoryImpl implements AccountRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<AccountEntity> findAll(){
        String sql = String.format("FROM AccountEntity");
        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

    public AccountEntity findByKey(Integer id){
        return sessionFactory.getCurrentSession().get(AccountEntity.class, id);
    }

    @SuppressWarnings("unchecked")
    public AccountEntity findByAccountNumber(String accNum){
        String sql = String.format("FROM AccountEntity a WHERE a.accountNumber = '%s'", accNum);
        return (AccountEntity) sessionFactory.getCurrentSession().createQuery(sql).uniqueResult();
    }
}