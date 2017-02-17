package me.eoh_digital.repository;

import me.eoh_digital.model.AccountEntity;

import java.util.List;

/**
 * Created by Admin on 2017/02/14.
 */
public interface AccountRepository {
    List<AccountEntity> findAll();
    AccountEntity findByKey(Integer id);
    AccountEntity findByAccountNumber(String accNum);
}
