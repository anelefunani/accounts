package me.eoh_digital.service;

import me.eoh_digital.model.ItemisedEntity;
import me.eoh_digital.repository.ItemisedBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 2017/02/17.
 */

@Service
public class ItemisedBillServiceImpl implements ItemisedBillService {
    @Autowired
    ItemisedBillRepository repository;

    @Override
    public List<ItemisedEntity> findAllByInvoiceId(Integer id) {
        return repository.findAllByInvoiceId(id);
    }
}
