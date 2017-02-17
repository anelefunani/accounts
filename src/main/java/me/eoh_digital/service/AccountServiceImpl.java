package me.eoh_digital.service;

import me.eoh_digital.model.AccountEntity;
import me.eoh_digital.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/02/14.
 */

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository repository;

    public List<AccountEntity> findAll() {
        return repository.findAll();
    }

    public AccountEntity findByKey(Integer key) {
        return repository.findByKey(key);
    }

    public AccountEntity findByAccountNumber(String accNum) {
        return repository.findByAccountNumber(accNum);
    }
}
