package me.eoh_digital.repository;

import me.eoh_digital.model.ItemisedEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 2017/02/17.
 */

@Repository
@Transactional
public class ItemisedBillRepositoryImpl implements ItemisedBillRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ItemisedEntity> findAllByInvoiceId(Integer id) {
        String sql = String.format("FROM ItemisedEntity billItems WHERE billItems.invoiceByInvoiceId.invoiceId = '%d'", id);
        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }
}
