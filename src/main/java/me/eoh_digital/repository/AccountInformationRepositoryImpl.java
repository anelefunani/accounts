package me.eoh_digital.repository;

import me.eoh_digital.views.AccountInformation;
import org.hibernate.SessionFactory;
import org.qlrm.mapper.JpaResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * Created by Admin on 2017/02/16.
 */

@Repository
@Transactional
public class AccountInformationRepositoryImpl implements AccountInformationRepository {
    @Autowired
    private SessionFactory sessionFactory;
    JpaResultMapper jpaResultMapper = new JpaResultMapper();

    @Override
    public AccountInformation findByAccountNumber(String accNum) {
        String sql = String.format("select  account.accountNumber, " +
                                            "contact.firstName, " +
                                            "contact.lastName, " +
                                            "contact.email, " +
                                            "invoice.invoiceId, " +
                                            "invoice.openingBalance, " +
                                            "invoice.closingBalance, " +
                                            "invoice.invoiceDueDate " +
                                            "from AccountEntity account " +
                                                "join ContactEntity contact " +
                                                "on account.accountId = contact.accountByAccountId " +
                                                "join InvoiceEntity invoice on account.accountId = invoice.accountByAccountId " +
                                                "where account.accountNumber = '%s'", accNum);
        Query accountInformationQuery = sessionFactory.getCurrentSession().createQuery(sql);
        try{
            AccountInformation accountInformation = jpaResultMapper.uniqueResult(accountInformationQuery, AccountInformation.class);
            return accountInformation;
        }catch (NoResultException nre){
            return null;
        }
    }
}
