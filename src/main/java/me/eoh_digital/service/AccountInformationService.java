package me.eoh_digital.service;

import me.eoh_digital.repository.AccountInformationRepository;
import me.eoh_digital.views.AccountInformation;

import java.util.List;

/**
 * Created by Admin on 2017/02/16.
 */
public interface AccountInformationService {
    AccountInformation findByAccountNumber(String accNum);
}
