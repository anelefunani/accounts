package me.eoh_digital.repository;

import me.eoh_digital.views.AccountInformation;

import java.util.List;

/**
 * Created by Admin on 2017/02/16.
 */

public interface AccountInformationRepository {
    AccountInformation findByAccountNumber(String accNum);
}
