package me.eoh_digital.service;

import me.eoh_digital.model.AccountEntity;
import me.eoh_digital.model.ContactEntity;

import java.util.List;

/**
 * Created by Admin on 2017/02/14.
 */

public interface AccountService {
    List<AccountEntity> findAll();
    AccountEntity findByKey(Integer key);
    AccountEntity findByAccountNumber(String accNum);
}
