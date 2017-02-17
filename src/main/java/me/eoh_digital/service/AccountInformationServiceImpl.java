package me.eoh_digital.service;

import me.eoh_digital.repository.AccountInformationRepository;
import me.eoh_digital.views.AccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/02/16.
 */

@Service
public class AccountInformationServiceImpl implements AccountInformationService {
    @Autowired
    private AccountInformationRepository repository;

    @Override
    public AccountInformation findByAccountNumber(String accNum) {
        return repository.findByAccountNumber(accNum);
    }
}
